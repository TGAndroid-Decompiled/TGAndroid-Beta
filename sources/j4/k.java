package j4;

import c3.h0;
import i2.m0;
public final class k implements i {
    public static final double[] f13832r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f13833a;
    public h0 f13834b;
    public final c0 f13835c;
    public final String d;
    public final e2.v f13836e;
    public final m0 f13837f;
    public final boolean[] f13838g = new boolean[4];
    public final j h;
    public long f13839i;
    public boolean f13840j;
    public boolean f13841k;
    public long f13842l;
    public long f13843m;
    public long f13844n;
    public long f13845o;
    public boolean f13846p;
    public boolean f13847q;

    public k(c0 c0Var, String str) {
        this.f13835c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f13837f = new m0(178);
            this.f13836e = new e2.v();
        } else {
            this.f13837f = null;
            this.f13836e = null;
        }
        this.f13843m = -9223372036854775807L;
        this.f13845o = -9223372036854775807L;
    }

    @Override
    public final void b(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13838g);
        j jVar = this.h;
        jVar.f13829a = false;
        jVar.f13830b = 0;
        jVar.f13831c = 0;
        m0 m0Var = this.f13837f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13839i = 0L;
        this.f13840j = false;
        this.f13843m = -9223372036854775807L;
        this.f13845o = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13833a = (String) f0Var.f13806e;
        f0Var.c();
        this.f13834b = qVar.f2(f0Var.f13805c, 2);
        c0 c0Var = this.f13835c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13834b);
        if (z10) {
            boolean z11 = this.f13846p;
            this.f13834b.c(this.f13845o, z11 ? 1 : 0, (int) (this.f13839i - this.f13844n), 0, null);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13843m = j3;
    }
}
