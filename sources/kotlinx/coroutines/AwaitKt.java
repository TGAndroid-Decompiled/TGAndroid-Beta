package kotlinx.coroutines;

import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

public abstract class AwaitKt {
    public static final Object awaitAll(Deferred[] deferredArr, Continuation continuation) {
        return deferredArr.length == 0 ? CollectionsKt.emptyList() : new AwaitAll(deferredArr).await(continuation);
    }

    public static final java.lang.Object joinAll(java.util.Collection r4, kotlin.coroutines.Continuation r5) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.joinAll(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
