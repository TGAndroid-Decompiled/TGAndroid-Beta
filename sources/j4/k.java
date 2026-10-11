package j4;

import c3.h0;
import i2.m0;
public final class k implements i {
    public static final double[] f13834r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f13835a;
    public h0 f13836b;
    public final c0 f13837c;
    public final String d;
    public final e2.v f13838e;
    public final m0 f13839f;
    public final boolean[] f13840g = new boolean[4];
    public final j h;
    public long f13841i;
    public boolean f13842j;
    public boolean f13843k;
    public long f13844l;
    public long f13845m;
    public long f13846n;
    public long f13847o;
    public boolean f13848p;
    public boolean f13849q;

    public k(c0 c0Var, String str) {
        this.f13837c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f13839f = new m0(178);
            this.f13838e = new e2.v();
        } else {
            this.f13839f = null;
            this.f13838e = null;
        }
        this.f13845m = -9223372036854775807L;
        this.f13847o = -9223372036854775807L;
    }

    @Override
    public final void b(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13840g);
        j jVar = this.h;
        jVar.f13831a = false;
        jVar.f13832b = 0;
        jVar.f13833c = 0;
        m0 m0Var = this.f13839f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13841i = 0L;
        this.f13842j = false;
        this.f13845m = -9223372036854775807L;
        this.f13847o = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13835a = (String) f0Var.f13808e;
        f0Var.c();
        this.f13836b = qVar.f2(f0Var.f13807c, 2);
        c0 c0Var = this.f13837c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13836b);
        if (z10) {
            boolean z11 = this.f13848p;
            this.f13836b.c(this.f13847o, z11 ? 1 : 0, (int) (this.f13841i - this.f13846n), 0, null);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13845m = j3;
    }
}
