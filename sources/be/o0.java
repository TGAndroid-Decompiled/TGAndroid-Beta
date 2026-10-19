package be;

import java.util.concurrent.ScheduledFuture;
public final class o0 implements p0 {
    public final ScheduledFuture f4306a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f4306a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f4306a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f4306a + ']';
    }
}
