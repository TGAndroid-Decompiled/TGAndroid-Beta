package j4;

import i2.k0;
public final class k implements i {
    public static final double[] f11603r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f11604a;
    public c3.h0 f11605b;
    public final d0 f11606c;
    public final String d;
    public final e2.v e;
    public final k0 f11607f;
    public final boolean[] f11608g = new boolean[4];
    public final j h;
    public long f11609i;
    public boolean f11610j;
    public boolean f11611k;
    public long f11612l;
    public long f11613m;
    public long f11614n;
    public long f11615o;
    public boolean f11616p;
    public boolean f11617q;

    public k(d0 d0Var, String str) {
        this.f11606c = d0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (d0Var != null) {
            this.f11607f = new k0(178);
            this.e = new e2.v();
        } else {
            this.f11607f = null;
            this.e = null;
        }
        this.f11613m = -9223372036854775807L;
        this.f11615o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void b() {
        f2.o.a(this.f11608g);
        j jVar = this.h;
        jVar.f11600a = false;
        jVar.f11601b = 0;
        jVar.f11602c = 0;
        k0 k0Var = this.f11607f;
        if (k0Var != null) {
            k0Var.g();
        }
        this.f11609i = 0L;
        this.f11610j = false;
        this.f11613m = -9223372036854775807L;
        this.f11615o = -9223372036854775807L;
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f11604a = g0Var.e;
        g0Var.b();
        this.f11605b = qVar.I(g0Var.d, 2);
        d0 d0Var = this.f11606c;
        if (d0Var != null) {
            d0Var.b(qVar, g0Var);
        }
    }

    @Override
    public final void d(boolean z10) {
        e2.d.h(this.f11605b);
        if (z10) {
            boolean z11 = this.f11616p;
            this.f11605b.c(this.f11615o, z11 ? 1 : 0, (int) (this.f11609i - this.f11614n), 0, null);
        }
    }

    @Override
    public final void e(int i10, long j3) {
        this.f11613m = j3;
    }
}
