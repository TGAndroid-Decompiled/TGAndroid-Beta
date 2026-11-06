package m4;

import f3.j0;
import l2.o0;
public final class k implements i {
    public static final double[] f19682r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f19683a;
    public j0 f19684b;
    public final c0 f19685c;
    public final String d;
    public final h2.x f19686e;
    public final o0 f19687f;
    public final boolean[] f19688g = new boolean[4];
    public final j h;
    public long f19689i;
    public boolean f19690j;
    public boolean f19691k;
    public long f19692l;
    public long f19693m;
    public long f19694n;
    public long f19695o;
    public boolean f19696p;
    public boolean f19697q;

    public k(c0 c0Var, String str) {
        this.f19685c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f19687f = new o0(178);
            this.f19686e = new h2.x();
        } else {
            this.f19687f = null;
            this.f19686e = null;
        }
        this.f19693m = -9223372036854775807L;
        this.f19695o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f19688g);
        j jVar = this.h;
        jVar.f19679a = false;
        jVar.f19680b = 0;
        jVar.f19681c = 0;
        o0 o0Var = this.f19687f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f19689i = 0L;
        this.f19690j = false;
        this.f19693m = -9223372036854775807L;
        this.f19695o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z9) {
        this.f19684b.getClass();
        if (z9) {
            boolean z10 = this.f19696p;
            this.f19684b.c(this.f19695o, z10 ? 1 : 0, (int) (this.f19689i - this.f19694n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19693m = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19683a = (String) g0Var.f19671e;
        g0Var.c();
        this.f19684b = qVar.O1(g0Var.f19670c, 2);
        c0 c0Var = this.f19685c;
        if (c0Var != null) {
            c0Var.b(qVar, g0Var);
        }
    }
}
