package m4;

import f3.j0;
import l2.o0;
public final class k implements i {
    public static final double[] f19690r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f19691a;
    public j0 f19692b;
    public final c0 f19693c;
    public final String d;
    public final h2.x f19694e;
    public final o0 f19695f;
    public final boolean[] f19696g = new boolean[4];
    public final j h;
    public long f19697i;
    public boolean f19698j;
    public boolean f19699k;
    public long f19700l;
    public long f19701m;
    public long f19702n;
    public long f19703o;
    public boolean f19704p;
    public boolean f19705q;

    public k(c0 c0Var, String str) {
        this.f19693c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f19695f = new o0(178);
            this.f19694e = new h2.x();
        } else {
            this.f19695f = null;
            this.f19694e = null;
        }
        this.f19701m = -9223372036854775807L;
        this.f19703o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f19696g);
        j jVar = this.h;
        jVar.f19687a = false;
        jVar.f19688b = 0;
        jVar.f19689c = 0;
        o0 o0Var = this.f19695f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f19697i = 0L;
        this.f19698j = false;
        this.f19701m = -9223372036854775807L;
        this.f19703o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z9) {
        this.f19692b.getClass();
        if (z9) {
            boolean z10 = this.f19704p;
            this.f19692b.c(this.f19703o, z10 ? 1 : 0, (int) (this.f19697i - this.f19702n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19701m = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19691a = (String) g0Var.f19679e;
        g0Var.c();
        this.f19692b = qVar.O1(g0Var.f19678c, 2);
        c0 c0Var = this.f19693c;
        if (c0Var != null) {
            c0Var.b(qVar, g0Var);
        }
    }
}
