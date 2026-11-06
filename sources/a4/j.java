package a4;

import f3.j0;
import f3.q;
import h2.x;
public abstract class j {
    public j0 f180b;
    public q f181c;
    public h d;
    public long f182e;
    public long f183f;
    public long f184g;
    public int h;
    public int f185i;
    public long f187k;
    public boolean f188l;
    public boolean f189m;
    public final f f179a = new f();
    public q4.q f186j = new q4.q(1, false);

    public void a(long j3) {
        this.f184g = j3;
    }

    public abstract long b(x xVar);

    public abstract boolean c(x xVar, long j3, q4.q qVar);

    public void d(boolean z9) {
        if (z9) {
            this.f186j = new q4.q(1, false);
            this.f183f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f182e = -1L;
        this.f184g = 0L;
    }
}
