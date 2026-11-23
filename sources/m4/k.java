package m4;

import f3.i0;
import l2.l0;
public final class k implements i {
    public static final double[] f20637r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f20638a;
    public i0 f20639b;
    public final c0 f20640c;
    public final String d;
    public final h2.x f20641e;
    public final l0 f20642f;
    public final boolean[] f20643g = new boolean[4];
    public final j h;
    public long f20644i;
    public boolean f20645j;
    public boolean f20646k;
    public long f20647l;
    public long f20648m;
    public long f20649n;
    public long f20650o;
    public boolean f20651p;
    public boolean f20652q;

    public k(c0 c0Var, String str) {
        this.f20640c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f20642f = new l0(178);
            this.f20641e = new h2.x();
        } else {
            this.f20642f = null;
            this.f20641e = null;
        }
        this.f20648m = -9223372036854775807L;
        this.f20650o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20643g);
        j jVar = this.h;
        jVar.f20634a = false;
        jVar.f20635b = 0;
        jVar.f20636c = 0;
        l0 l0Var = this.f20642f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20644i = 0L;
        this.f20645j = false;
        this.f20648m = -9223372036854775807L;
        this.f20650o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20639b.getClass();
        if (z10) {
            boolean z11 = this.f20651p;
            this.f20639b.c(this.f20650o, z11 ? 1 : 0, (int) (this.f20644i - this.f20649n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20648m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20638a = (String) f0Var.f20611e;
        f0Var.c();
        this.f20639b = qVar.d2(f0Var.f20610c, 2);
        c0 c0Var = this.f20640c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
