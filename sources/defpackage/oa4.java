package defpackage;

import java.util.ArrayList;
public final class oa4 {
    public final ka4 a;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public float j;
    public float k;
    public float m;
    public float n;
    public float o;
    public long p;
    public final pa4 q;
    public final long b = pa4.g.nextLong();
    public final ArrayList i = new ArrayList();
    public float l = Float.MAX_VALUE;

    public oa4(pa4 pa4Var, ka4 ka4Var, long j) {
        this.q = pa4Var;
        this.a = ka4Var;
        this.p = j;
        this.f = j;
        this.c = j;
        b(ka4Var, j);
    }

    public final void a(long j) {
        long j2 = this.f;
        if (j2 >= 0 && !this.h) {
            this.d = (j - j2) + this.d;
            this.e = Math.max(0L, Math.min(j, this.q.f + 15000) - this.f) + this.e;
            this.f = j;
        }
    }

    public final void b(ka4 ka4Var, long j) {
        float f = ka4Var.g;
        float f2 = ka4Var.f;
        float f3 = this.m;
        if (f3 > 0.0f && (f2 > this.o || f < this.n)) {
            if (j - this.p >= 300) {
                this.i.add(new float[]{this.l, f3});
            }
            this.l = Float.MAX_VALUE;
            this.m = 0.0f;
            this.p = j;
        }
        float f4 = this.l;
        this.n = f2;
        this.l = Math.min(f4, f2);
        float f5 = this.m;
        this.o = f;
        this.m = Math.max(f5, f);
        this.j = ka4Var.h;
        this.k = ka4Var.i;
    }
}
