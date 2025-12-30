package me.vkryl.core;

import java.util.ArrayList;
import java.util.Collections;

public abstract class ArrayUtils {
    public static boolean removeSorted(ArrayList arrayList, Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(arrayList, comparable);
        if (iBinarySearch < 0) {
            return false;
        }
        arrayList.remove(iBinarySearch);
        return true;
    }

    public static int addSorted(ArrayList arrayList, Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(arrayList, comparable);
        if (iBinarySearch >= 0) {
            throw new IllegalArgumentException("Element already exists in list");
        }
        int i = (-iBinarySearch) - 1;
        arrayList.add(i, comparable);
        return i;
    }
}
