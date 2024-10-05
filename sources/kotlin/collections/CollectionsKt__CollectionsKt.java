package kotlin.collections;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public abstract class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    public static final Collection asCollection(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayAsCollection(objArr, false);
    }

    public static final List emptyList() {
        return EmptyList.INSTANCE;
    }

    public static List listOf(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt___ArraysJvmKt.asList(elements) : emptyList();
    }

    public static List optimizeReadOnlyList(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt.listOf(list.get(0)) : emptyList();
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
