package j4;

import c3.k0;
import i2.p0;
public final class k implements i {
    public static final double[] f9500r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f9501a;
    public k0 f9502b;
    public final d0 f9503c;
    public final String d;
    public final e2.x e;
    public final p0 f9504f;
    public final boolean[] f9505g = new boolean[4];
    public final j h;
    public long f9506i;
    public boolean f9507j;
    public boolean f9508k;
    public long f9509l;
    public long f9510m;
    public long f9511n;
    public long f9512o;
    public boolean f9513p;
    public boolean f9514q;

    public k(d0 d0Var, String str) {
        this.f9503c = d0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (d0Var != null) {
            this.f9504f = new p0(178);
            this.e = new e2.x();
        } else {
            this.f9504f = null;
            this.e = null;
        }
        this.f9510m = -9223372036854775807L;
        this.f9512o = -9223372036854775807L;
    }

    @Override
    public final void c(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.c(e2.x):void");
    }

    @Override
    public final void e() {
        f2.q.b(this.f9505g);
        j jVar = this.h;
        jVar.f9497a = false;
        jVar.f9498b = 0;
        jVar.f9499c = 0;
        p0 p0Var = this.f9504f;
        if (p0Var != null) {
            p0Var.g();
        }
        this.f9506i = 0L;
        this.f9507j = false;
        this.f9510m = -9223372036854775807L;
        this.f9512o = -9223372036854775807L;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9501a = (String) g0Var.e;
        g0Var.c();
        this.f9502b = qVar.I1(g0Var.f9491c, 2);
        d0 d0Var = this.f9503c;
        if (d0Var != null) {
            d0Var.b(qVar, g0Var);
        }
    }

    @Override
    public final void g(boolean z10) {
        this.f9502b.getClass();
        if (z10) {
            boolean z11 = this.f9513p;
            this.f9502b.c(this.f9512o, z11 ? 1 : 0, (int) (this.f9506i - this.f9511n), 0, null);
        }
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9510m = j10;
    }
}
