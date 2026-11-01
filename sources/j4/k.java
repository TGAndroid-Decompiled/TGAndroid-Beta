package j4;

import c3.k0;
import i2.p0;
public final class k implements i {
    public static final double[] f9501r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f9502a;
    public k0 f9503b;
    public final d0 f9504c;
    public final String d;
    public final e2.x e;
    public final p0 f9505f;
    public final boolean[] f9506g = new boolean[4];
    public final j h;
    public long f9507i;
    public boolean f9508j;
    public boolean f9509k;
    public long f9510l;
    public long f9511m;
    public long f9512n;
    public long f9513o;
    public boolean f9514p;
    public boolean f9515q;

    public k(d0 d0Var, String str) {
        this.f9504c = d0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (d0Var != null) {
            this.f9505f = new p0(178);
            this.e = new e2.x();
        } else {
            this.f9505f = null;
            this.e = null;
        }
        this.f9511m = -9223372036854775807L;
        this.f9513o = -9223372036854775807L;
    }

    @Override
    public final void c(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.c(e2.x):void");
    }

    @Override
    public final void e() {
        f2.q.b(this.f9506g);
        j jVar = this.h;
        jVar.f9498a = false;
        jVar.f9499b = 0;
        jVar.f9500c = 0;
        p0 p0Var = this.f9505f;
        if (p0Var != null) {
            p0Var.g();
        }
        this.f9507i = 0L;
        this.f9508j = false;
        this.f9511m = -9223372036854775807L;
        this.f9513o = -9223372036854775807L;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9502a = (String) g0Var.e;
        g0Var.c();
        this.f9503b = qVar.I1(g0Var.f9492c, 2);
        d0 d0Var = this.f9504c;
        if (d0Var != null) {
            d0Var.b(qVar, g0Var);
        }
    }

    @Override
    public final void g(boolean z10) {
        this.f9503b.getClass();
        if (z10) {
            boolean z11 = this.f9514p;
            this.f9503b.c(this.f9513o, z11 ? 1 : 0, (int) (this.f9507i - this.f9512n), 0, null);
        }
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9511m = j10;
    }
}
