package be;

import java.util.concurrent.ScheduledFuture;
public final class o0 implements p0 {
    public final ScheduledFuture f4313a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f4313a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f4313a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f4313a + ']';
    }
}
