package ld;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f12337a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f12337a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f12337a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f12337a + ']';
    }
}
