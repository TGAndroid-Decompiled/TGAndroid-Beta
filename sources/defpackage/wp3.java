package defpackage;

import java.util.concurrent.ScheduledFuture;
public final class wp3 implements xp3 {
    public final ScheduledFuture a;

    public wp3(ScheduledFuture scheduledFuture) {
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
