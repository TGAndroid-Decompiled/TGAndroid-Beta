package ld;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f12015a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f12015a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f12015a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f12015a + ']';
    }
}
