package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class InlineList {
    public static Object m331constructorimpl(Object obj) {
        return obj;
    }

    public static Object m332constructorimpl$default(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m331constructorimpl(obj);
    }

    public static final Object m333plusFjFbRPM(Object obj, Object obj2) {
        if (obj == null) {
            return m331constructorimpl(obj2);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return m331constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m331constructorimpl(arrayList);
    }
}
