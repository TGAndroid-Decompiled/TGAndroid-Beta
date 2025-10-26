package me.vkryl.core;

import java.util.ArrayList;
import java.util.Collections;

public abstract class ArrayUtils {
    public static boolean removeSorted(ArrayList arrayList, Comparable comparable) {
        int binarySearch = Collections.binarySearch(arrayList, comparable);
        if (binarySearch < 0) {
            return false;
        }
        arrayList.remove(binarySearch);
        return true;
    }

    public static int addSorted(ArrayList arrayList, Comparable comparable) {
        int binarySearch = Collections.binarySearch(arrayList, comparable);
        if (binarySearch >= 0) {
            throw new IllegalArgumentException("Element already exists in list");
        }
        int i = (-binarySearch) - 1;
        arrayList.add(i, comparable);
        return i;
    }
}
