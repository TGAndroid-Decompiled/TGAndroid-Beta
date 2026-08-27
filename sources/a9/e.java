package a9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class e implements j {

    public final int f167a;

    public final h f168b;

    public final Runnable f169c;
    public final long d;

    public final long f170e;

    public final TimeUnit f171f;

    public e(h hVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f167a = i10;
        this.f168b = hVar;
        this.f169c = runnable;
        this.d = j10;
        this.f170e = j11;
        this.f171f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(i iVar) {
        switch (this.f167a) {
            case 0:
                h hVar = this.f168b;
                return hVar.f179b.scheduleAtFixedRate(new f(hVar, this.f169c, iVar, 0), this.d, this.f170e, this.f171f);
            default:
                h hVar2 = this.f168b;
                return hVar2.f179b.scheduleWithFixedDelay(new f(hVar2, this.f169c, iVar, 2), this.d, this.f170e, this.f171f);
        }
    }
}
