package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

public interface Delay {
    DisposableHandle invokeOnTimeout(long j, TimeoutCoroutine timeoutCoroutine, CoroutineContext coroutineContext);

    void scheduleResumeAfterDelay(long j, CancellableContinuationImpl cancellableContinuationImpl);
}
