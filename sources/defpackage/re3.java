package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class re3 implements ve3 {
    public final byte a;
    public final ue3 b;
    public final Runnable c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public re3(ue3 ue3Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = ue3Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(k6d k6dVar) {
        byte b = this.a;
        Runnable runnable = this.c;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                return ue3Var.b.scheduleAtFixedRate(new se3(ue3Var, runnable, k6dVar, (byte) 0), this.d, this.e, this.f);
            default:
                return ue3Var.b.scheduleWithFixedDelay(new se3(ue3Var, runnable, k6dVar, (byte) 2), this.d, this.e, this.f);
        }
    }
}
