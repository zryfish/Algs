/**
 * Created by zryzhang on 1/23/2017.
 */

package com.malus.zryzhang.algorithms;

import com.malus.zryzhang.utils.In;
import com.malus.zryzhang.utils.StdIn;

import java.util.Arrays;

public class BinarySearch {

    private BinarySearch() { }

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) hi = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(whitelist, key) == -1)
                StdOut.println(key);
        }
    }
}
