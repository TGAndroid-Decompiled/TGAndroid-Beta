package defpackage;

import java.util.concurrent.ScheduledFuture;
public final class mo3 implements no3 {
    public final ScheduledFuture a;

    public mo3(ScheduledFuture scheduledFuture) {
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
