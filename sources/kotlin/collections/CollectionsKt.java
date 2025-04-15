package kotlin.collections;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

public abstract class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static int collectionSizeOrDefault(Iterable iterable, int i) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, i);
    }

    public static int getLastIndex(List list) {
        return CollectionsKt__CollectionsKt.getLastIndex(list);
    }

    public static Appendable joinTo$default(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        Appendable joinTo;
        joinTo = CollectionsKt___CollectionsKt.joinTo(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : function1);
        return joinTo;
    }

    public static String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable, charSequence, charSequence2, charSequence3, i, charSequence4, function1, i2, obj);
    }

    public static Comparable minOrNull(Iterable iterable) {
        return CollectionsKt___CollectionsKt.minOrNull(iterable);
    }

    public static void throwIndexOverflow() {
        CollectionsKt__CollectionsKt.throwIndexOverflow();
    }

    public static Set toSet(Iterable iterable) {
        return CollectionsKt___CollectionsKt.toSet(iterable);
    }
}
