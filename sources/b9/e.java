package b9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class e implements i {
    public final int f2001a;
    public final h f2002b;
    public final Runnable f2003c;
    public final long d;
    public final long f2004e;
    public final TimeUnit f2005f;

    public e(h hVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f2001a = i10;
        this.f2002b = hVar;
        this.f2003c = runnable;
        this.d = j10;
        this.f2004e = j11;
        this.f2005f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(ha.c cVar) {
        switch (this.f2001a) {
            case 0:
                h hVar = this.f2002b;
                return hVar.f2013b.scheduleAtFixedRate(new f(hVar, this.f2003c, cVar, 0), this.d, this.f2004e, this.f2005f);
            default:
                h hVar2 = this.f2002b;
                return hVar2.f2013b.scheduleWithFixedDelay(new f(hVar2, this.f2003c, cVar, 2), this.d, this.f2004e, this.f2005f);
        }
    }
}
