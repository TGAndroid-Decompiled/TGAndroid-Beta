package j4;

import c3.h0;
import i2.m0;
public final class k implements i {
    public static final double[] f13835r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f13836a;
    public h0 f13837b;
    public final c0 f13838c;
    public final String d;
    public final e2.v f13839e;
    public final m0 f13840f;
    public final boolean[] f13841g = new boolean[4];
    public final j h;
    public long f13842i;
    public boolean f13843j;
    public boolean f13844k;
    public long f13845l;
    public long f13846m;
    public long f13847n;
    public long f13848o;
    public boolean f13849p;
    public boolean f13850q;

    public k(c0 c0Var, String str) {
        this.f13838c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f13840f = new m0(178);
            this.f13839e = new e2.v();
        } else {
            this.f13840f = null;
            this.f13839e = null;
        }
        this.f13846m = -9223372036854775807L;
        this.f13848o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.p.a(this.f13841g);
        j jVar = this.h;
        jVar.f13832a = false;
        jVar.f13833b = 0;
        jVar.f13834c = 0;
        m0 m0Var = this.f13840f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13842i = 0L;
        this.f13843j = false;
        this.f13846m = -9223372036854775807L;
        this.f13848o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13836a = (String) f0Var.f13809e;
        f0Var.c();
        this.f13837b = qVar.f2(f0Var.f13808c, 2);
        c0 c0Var = this.f13838c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13837b);
        if (z10) {
            boolean z11 = this.f13849p;
            this.f13837b.c(this.f13848o, z11 ? 1 : 0, (int) (this.f13842i - this.f13847n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13846m = j3;
    }
}
