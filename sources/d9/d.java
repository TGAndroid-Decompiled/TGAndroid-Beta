package d9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class d implements h {
    public final int f4356a;
    public final g f4357b;
    public final Runnable f4358c;
    public final long d;
    public final long f4359e;
    public final TimeUnit f4360f;

    public d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f4356a = i10;
        this.f4357b = gVar;
        this.f4358c = runnable;
        this.d = j10;
        this.f4359e = j11;
        this.f4360f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(y5.h hVar) {
        switch (this.f4356a) {
            case 0:
                g gVar = this.f4357b;
                return gVar.f4368b.scheduleAtFixedRate(new e(gVar, this.f4358c, hVar, 0), this.d, this.f4359e, this.f4360f);
            default:
                g gVar2 = this.f4357b;
                return gVar2.f4368b.scheduleWithFixedDelay(new e(gVar2, this.f4358c, hVar, 2), this.d, this.f4359e, this.f4360f);
        }
    }
}
