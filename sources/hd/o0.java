package hd;

import java.util.concurrent.ScheduledFuture;
public final class o0 implements p0 {
    public final ScheduledFuture f10468a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f10468a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f10468a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f10468a + ']';
    }
}
