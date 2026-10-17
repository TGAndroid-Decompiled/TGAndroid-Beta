package be;

import java.util.concurrent.ScheduledFuture;
public final class o0 implements p0 {
    public final ScheduledFuture f4309a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f4309a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f4309a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f4309a + ']';
    }
}
