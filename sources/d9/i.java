package d9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class i extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f4369n;

    public i(h hVar) {
        this.f4369n = hVar.a(new y5.h(this, 11));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f4369n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z4;
        ScheduledFuture scheduledFuture = this.f4369n;
        Object obj = this.f2014a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f1998a) {
            z4 = true;
        } else {
            z4 = false;
        }
        scheduledFuture.cancel(z4);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4369n.getDelay(timeUnit);
    }
}
