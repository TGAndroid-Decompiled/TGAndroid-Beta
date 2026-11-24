package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class kd3 extends a4 implements ScheduledFuture {
    public final ScheduledFuture n;

    public kd3(jd3 jd3Var) {
        this.n = jd3Var.a(new l69(this, (byte) 28));
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
