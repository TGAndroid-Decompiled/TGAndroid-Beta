package j4;

import c3.j0;
import i2.p0;
public final class k implements i {
    public static final double[] f15338r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f15339a;
    public j0 f15340b;
    public final c0 f15341c;
    public final String d;
    public final e2.x e;
    public final p0 f15342f;
    public final boolean[] f15343g = new boolean[4];
    public final j h;
    public long f15344i;
    public boolean f15345j;
    public boolean f15346k;
    public long f15347l;
    public long f15348m;
    public long f15349n;
    public long f15350o;
    public boolean f15351p;
    public boolean f15352q;

    public k(c0 c0Var, String str) {
        this.f15341c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f15342f = new p0(178);
            this.e = new e2.x();
        } else {
            this.f15342f = null;
            this.e = null;
        }
        this.f15348m = -9223372036854775807L;
        this.f15350o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f15343g);
        j jVar = this.h;
        jVar.f15335a = false;
        jVar.f15336b = 0;
        jVar.f15337c = 0;
        p0 p0Var = this.f15342f;
        if (p0Var != null) {
            p0Var.g();
        }
        this.f15344i = 0L;
        this.f15345j = false;
        this.f15348m = -9223372036854775807L;
        this.f15350o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15339a = (String) f0Var.e;
        f0Var.c();
        this.f15340b = qVar.F1(f0Var.f15315c, 2);
        c0 c0Var = this.f15341c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f15340b.getClass();
        if (z10) {
            boolean z11 = this.f15351p;
            this.f15340b.c(this.f15350o, z11 ? 1 : 0, (int) (this.f15344i - this.f15349n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15348m = j10;
    }
}
