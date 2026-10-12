package ae;

import java.util.concurrent.ScheduledFuture;
public final class p0 implements q0 {
    public final ScheduledFuture f487a;

    public p0(ScheduledFuture scheduledFuture) {
        this.f487a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f487a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f487a + ']';
    }
}
