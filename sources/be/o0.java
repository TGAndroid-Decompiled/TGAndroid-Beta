package be;

import java.util.concurrent.ScheduledFuture;
public final class o0 implements p0 {
    public final ScheduledFuture f2697a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f2697a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f2697a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f2697a + ']';
    }
}
