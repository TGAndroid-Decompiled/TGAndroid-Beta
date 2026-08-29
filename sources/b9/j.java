package b9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class j extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f2014n;

    public j(i iVar) {
        this.f2014n = iVar.a(new ha.c(this, 6));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f2014n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f2014n;
        Object obj = this.f2738a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f2722a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2014n.getDelay(timeUnit);
    }
}
