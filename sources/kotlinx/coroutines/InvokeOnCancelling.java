package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class InvokeOnCancelling extends JobCancellingNode {
    private static final AtomicIntegerFieldUpdater _invoked$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    private final InternalCompletionHandler handler;

    public InvokeOnCancelling(InternalCompletionHandler internalCompletionHandler) {
        this.handler = internalCompletionHandler;
    }

    @Override
    public void invoke(Throwable th) {
        if (_invoked$volatile$FU.compareAndSet(this, 0, 1)) {
            this.handler.invoke(th);
        }
    }
}
