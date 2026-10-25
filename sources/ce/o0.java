package ce;

import java.util.concurrent.ScheduledFuture;
public final class o0 implements p0 {
    public final ScheduledFuture f6249a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f6249a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f6249a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f6249a + ']';
    }
}
