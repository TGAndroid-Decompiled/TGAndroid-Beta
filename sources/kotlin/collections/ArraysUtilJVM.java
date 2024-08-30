package kotlin.collections;

import java.util.Arrays;
import java.util.List;

abstract class ArraysUtilJVM {
    public static List asList(Object[] objArr) {
        return Arrays.asList(objArr);
    }
}
