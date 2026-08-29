package jd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f11501a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f11501a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f11501a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f11501a + ']';
    }
}
