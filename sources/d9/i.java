package d9;

import androidx.biometric.e0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class i extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f4271n;

    public i(h hVar) {
        this.f4271n = hVar.a(new e0(this, 7));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f4271n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z4;
        ScheduledFuture scheduledFuture = this.f4271n;
        Object obj = this.f1875a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f1861a) {
            z4 = true;
        } else {
            z4 = false;
        }
        scheduledFuture.cancel(z4);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4271n.getDelay(timeUnit);
    }
}
