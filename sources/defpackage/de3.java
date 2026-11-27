package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class de3 extends b4 implements ScheduledFuture {
    public final ScheduledFuture n;

    public de3(ce3 ce3Var) {
        this.n = ce3Var.a(new z8d(this, (byte) 28));
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
        if ((obj instanceof u3) && ((u3) obj).a) {
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
