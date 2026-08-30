package d9;

import androidx.biometric.f0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class d implements h {
    public final int f4278a;
    public final g f4279b;
    public final Runnable f4280c;
    public final long d;
    public final long e;
    public final TimeUnit f4281f;

    public d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f4278a = i10;
        this.f4279b = gVar;
        this.f4280c = runnable;
        this.d = j10;
        this.e = j11;
        this.f4281f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f0 f0Var) {
        switch (this.f4278a) {
            case 0:
                g gVar = this.f4279b;
                return gVar.f4289b.scheduleAtFixedRate(new e(gVar, this.f4280c, f0Var, 0), this.d, this.e, this.f4281f);
            default:
                g gVar2 = this.f4279b;
                return gVar2.f4289b.scheduleWithFixedDelay(new e(gVar2, this.f4280c, f0Var, 2), this.d, this.e, this.f4281f);
        }
    }
}
