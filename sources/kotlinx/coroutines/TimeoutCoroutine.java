package kotlinx.coroutines;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;

public final class TimeoutCoroutine extends ScopeCoroutine implements Runnable {
    public final long time;

    public TimeoutCoroutine(long j, Continuation continuation) {
        super(continuation, continuation.getContext());
        this.time = j;
    }

    @Override
    public final String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core() + "(timeMillis=" + this.time + ')';
    }

    @Override
    public final void run() {
        JobKt.getDelay(this.context);
        cancelImpl$kotlinx_coroutines_core(new TimeoutCancellationException(Fragment$$ExternalSyntheticOutline0.m(new StringBuilder("Timed out waiting for "), this.time, " ms"), this));
    }
}
