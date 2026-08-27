package a9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class k extends c0.h implements ScheduledFuture {

    public final ScheduledFuture f182n;

    public k(j jVar) {
        this.f182n = jVar.a(new i(this, 0));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f182n.compareTo(delayed);
    }

    @Override
    public final void d() {
        ScheduledFuture scheduledFuture = this.f182n;
        Object obj = this.f2208a;
        scheduledFuture.cancel((obj instanceof c0.a) && ((c0.a) obj).f2192a);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f182n.getDelay(timeUnit);
    }
}
