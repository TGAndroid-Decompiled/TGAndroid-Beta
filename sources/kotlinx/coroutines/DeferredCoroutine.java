package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

public class DeferredCoroutine extends AbstractCoroutine implements Deferred {
    @Override
    public final Object await(Continuation continuation) throws Throwable {
        Object objAwaitInternal = awaitInternal(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objAwaitInternal;
    }
}
