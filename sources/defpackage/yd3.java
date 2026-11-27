package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class yd3 implements ce3 {
    public final byte a;
    public final be3 b;
    public final Runnable c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public yd3(be3 be3Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = be3Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(z8d z8dVar) {
        byte b = this.a;
        Runnable runnable = this.c;
        be3 be3Var = this.b;
        switch (b) {
            case 0:
                return be3Var.b.scheduleAtFixedRate(new zd3(be3Var, runnable, z8dVar, (byte) 0), this.d, this.e, this.f);
            default:
                return be3Var.b.scheduleWithFixedDelay(new zd3(be3Var, runnable, z8dVar, (byte) 2), this.d, this.e, this.f);
        }
    }
}
