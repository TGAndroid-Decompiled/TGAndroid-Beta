package kotlinx.coroutines;

import java.util.concurrent.Future;

abstract class JobKt__FutureKt {
    public static final void cancelFutureOnCancellation(CancellableContinuation cancellableContinuation, Future future) {
        CancellableContinuationKt.invokeOnCancellation(cancellableContinuation, new CancelFutureOnCancel(future));
    }
}
