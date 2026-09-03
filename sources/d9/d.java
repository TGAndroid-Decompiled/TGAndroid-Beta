package d9;

import androidx.biometric.e0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class d implements h {
    public final int f4259a;
    public final g f4260b;
    public final Runnable f4261c;
    public final long d;
    public final long e;
    public final TimeUnit f4262f;

    public d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f4259a = i10;
        this.f4260b = gVar;
        this.f4261c = runnable;
        this.d = j10;
        this.e = j11;
        this.f4262f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(e0 e0Var) {
        switch (this.f4259a) {
            case 0:
                g gVar = this.f4260b;
                return gVar.f4270b.scheduleAtFixedRate(new e(gVar, this.f4261c, e0Var, 0), this.d, this.e, this.f4262f);
            default:
                g gVar2 = this.f4260b;
                return gVar2.f4270b.scheduleWithFixedDelay(new e(gVar2, this.f4261c, e0Var, 2), this.d, this.e, this.f4262f);
        }
    }
}
