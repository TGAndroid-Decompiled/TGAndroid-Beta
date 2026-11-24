package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class fd3 implements jd3 {
    public final byte a;
    public final id3 b;
    public final Runnable c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public fd3(id3 id3Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = id3Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l69 l69Var) {
        byte b = this.a;
        Runnable runnable = this.c;
        id3 id3Var = this.b;
        switch (b) {
            case 0:
                return id3Var.b.scheduleAtFixedRate(new gd3(id3Var, runnable, l69Var, (byte) 0), this.d, this.e, this.f);
            default:
                return id3Var.b.scheduleWithFixedDelay(new gd3(id3Var, runnable, l69Var, (byte) 2), this.d, this.e, this.f);
        }
    }
}
