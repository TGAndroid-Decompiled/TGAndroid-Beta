package m4;

import f3.j0;
import l2.o0;
public final class k implements i {
    public static final double[] f19685r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f19686a;
    public j0 f19687b;
    public final c0 f19688c;
    public final String d;
    public final h2.x f19689e;
    public final o0 f19690f;
    public final boolean[] f19691g = new boolean[4];
    public final j h;
    public long f19692i;
    public boolean f19693j;
    public boolean f19694k;
    public long f19695l;
    public long f19696m;
    public long f19697n;
    public long f19698o;
    public boolean f19699p;
    public boolean f19700q;

    public k(c0 c0Var, String str) {
        this.f19688c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f19690f = new o0(178);
            this.f19689e = new h2.x();
        } else {
            this.f19690f = null;
            this.f19689e = null;
        }
        this.f19696m = -9223372036854775807L;
        this.f19698o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f19691g);
        j jVar = this.h;
        jVar.f19682a = false;
        jVar.f19683b = 0;
        jVar.f19684c = 0;
        o0 o0Var = this.f19690f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f19692i = 0L;
        this.f19693j = false;
        this.f19696m = -9223372036854775807L;
        this.f19698o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z9) {
        this.f19687b.getClass();
        if (z9) {
            boolean z10 = this.f19699p;
            this.f19687b.c(this.f19698o, z10 ? 1 : 0, (int) (this.f19692i - this.f19697n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19696m = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19686a = (String) g0Var.f19674e;
        g0Var.c();
        this.f19687b = qVar.O1(g0Var.f19673c, 2);
        c0 c0Var = this.f19688c;
        if (c0Var != null) {
            c0Var.b(qVar, g0Var);
        }
    }
}
