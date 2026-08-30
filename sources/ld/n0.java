package ld;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f11905a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f11905a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f11905a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f11905a + ']';
    }
}
