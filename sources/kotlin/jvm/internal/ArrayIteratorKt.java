package kotlin.jvm.internal;

import java.util.Iterator;

public final class ArrayIteratorKt {
    public static final <T> Iterator<T> iterator(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayIterator(array);
    }
}
