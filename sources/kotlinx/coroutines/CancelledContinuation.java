package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class CancelledContinuation extends CompletedExceptionally {
    public static final AtomicIntegerFieldUpdater _resumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed$volatile");
    private volatile int _resumed$volatile;

    public CancelledContinuation(CancellableContinuationImpl cancellableContinuationImpl, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + cancellableContinuationImpl + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
