package m4;

import f3.i0;
import l2.l0;
public final class k implements i {
    public static final double[] f20643r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f20644a;
    public i0 f20645b;
    public final c0 f20646c;
    public final String d;
    public final h2.x f20647e;
    public final l0 f20648f;
    public final boolean[] f20649g = new boolean[4];
    public final j h;
    public long f20650i;
    public boolean f20651j;
    public boolean f20652k;
    public long f20653l;
    public long f20654m;
    public long f20655n;
    public long f20656o;
    public boolean f20657p;
    public boolean f20658q;

    public k(c0 c0Var, String str) {
        this.f20646c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f20648f = new l0(178);
            this.f20647e = new h2.x();
        } else {
            this.f20648f = null;
            this.f20647e = null;
        }
        this.f20654m = -9223372036854775807L;
        this.f20656o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20649g);
        j jVar = this.h;
        jVar.f20640a = false;
        jVar.f20641b = 0;
        jVar.f20642c = 0;
        l0 l0Var = this.f20648f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20650i = 0L;
        this.f20651j = false;
        this.f20654m = -9223372036854775807L;
        this.f20656o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20645b.getClass();
        if (z10) {
            boolean z11 = this.f20657p;
            this.f20645b.c(this.f20656o, z11 ? 1 : 0, (int) (this.f20650i - this.f20655n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20654m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20644a = (String) f0Var.f20617e;
        f0Var.c();
        this.f20645b = qVar.d2(f0Var.f20616c, 2);
        c0 c0Var = this.f20646c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
