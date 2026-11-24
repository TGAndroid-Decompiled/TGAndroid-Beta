package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class we3 extends a4 implements ScheduledFuture {
    public final ScheduledFuture n;

    public we3(ve3 ve3Var) {
        this.n = ve3Var.a(new k6d(this, (byte) 27));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z;
        ScheduledFuture scheduledFuture = this.n;
        Object obj = this.a;
        if ((obj instanceof t3) && ((t3) obj).a) {
            z = true;
        } else {
            z = false;
        }
        scheduledFuture.cancel(z);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.n.getDelay(timeUnit);
    }
}
