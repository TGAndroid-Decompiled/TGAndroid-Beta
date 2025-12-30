package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

class DeferredCoroutine extends AbstractCoroutine implements Deferred {
    @Override
    public Object await(Continuation continuation) {
        return await$suspendImpl(this, continuation);
    }

    public DeferredCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override
    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    static Object await$suspendImpl(DeferredCoroutine deferredCoroutine, Continuation continuation) throws Throwable {
        Object objAwaitInternal = deferredCoroutine.awaitInternal(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objAwaitInternal;
    }
}
