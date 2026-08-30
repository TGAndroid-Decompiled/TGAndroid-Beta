package d9;

import androidx.biometric.f0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class i extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f4290n;

    public i(h hVar) {
        this.f4290n = hVar.a(new f0(this, 8));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f4290n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z4;
        ScheduledFuture scheduledFuture = this.f4290n;
        Object obj = this.f1853a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f1839a) {
            z4 = true;
        } else {
            z4 = false;
        }
        scheduledFuture.cancel(z4);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4290n.getDelay(timeUnit);
    }
}
