package defpackage;

import java.util.concurrent.ScheduledFuture;
public final class dp3 implements ep3 {
    public final ScheduledFuture a;

    public dp3(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
