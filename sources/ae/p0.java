package ae;

import java.util.concurrent.ScheduledFuture;
public final class p0 implements q0 {
    public final ScheduledFuture f485a;

    public p0(ScheduledFuture scheduledFuture) {
        this.f485a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f485a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f485a + ']';
    }
}
