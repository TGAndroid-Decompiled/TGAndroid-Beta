package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public abstract class AbstractCoroutineContextKey implements CoroutineContext.Key {
    private final Function1 safeCast;
    private final CoroutineContext.Key topmostKey;

    public AbstractCoroutineContextKey(CoroutineContext.Key baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.safeCast = safeCast;
        this.topmostKey = baseKey instanceof AbstractCoroutineContextKey ? ((AbstractCoroutineContextKey) baseKey).topmostKey : baseKey;
    }

    public final boolean isSubKey$kotlin_stdlib(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.topmostKey == key;
    }

    public final CoroutineContext.Element tryCast$kotlin_stdlib(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.safeCast.invoke(element);
    }
}
