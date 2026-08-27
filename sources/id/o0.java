package id;

import java.util.concurrent.ScheduledFuture;

public final class o0 implements p0 {

    public final ScheduledFuture f11177a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f11177a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f11177a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f11177a + ']';
    }
}
