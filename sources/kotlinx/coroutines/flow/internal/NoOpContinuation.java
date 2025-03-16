package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

final class NoOpContinuation implements Continuation {
    public static final NoOpContinuation INSTANCE = new NoOpContinuation();
    private static final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

    private NoOpContinuation() {
    }

    @Override
    public CoroutineContext getContext() {
        return context;
    }

    @Override
    public void resumeWith(Object obj) {
    }
}
