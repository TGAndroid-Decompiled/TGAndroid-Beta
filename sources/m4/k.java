package m4;

import f3.i0;
import l2.l0;
public final class k implements i {
    public static final double[] f20640r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f20641a;
    public i0 f20642b;
    public final c0 f20643c;
    public final String d;
    public final h2.x f20644e;
    public final l0 f20645f;
    public final boolean[] f20646g = new boolean[4];
    public final j h;
    public long f20647i;
    public boolean f20648j;
    public boolean f20649k;
    public long f20650l;
    public long f20651m;
    public long f20652n;
    public long f20653o;
    public boolean f20654p;
    public boolean f20655q;

    public k(c0 c0Var, String str) {
        this.f20643c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f20645f = new l0(178);
            this.f20644e = new h2.x();
        } else {
            this.f20645f = null;
            this.f20644e = null;
        }
        this.f20651m = -9223372036854775807L;
        this.f20653o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20646g);
        j jVar = this.h;
        jVar.f20637a = false;
        jVar.f20638b = 0;
        jVar.f20639c = 0;
        l0 l0Var = this.f20645f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20647i = 0L;
        this.f20648j = false;
        this.f20651m = -9223372036854775807L;
        this.f20653o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20642b.getClass();
        if (z10) {
            boolean z11 = this.f20654p;
            this.f20642b.c(this.f20653o, z11 ? 1 : 0, (int) (this.f20647i - this.f20652n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20651m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20641a = (String) f0Var.f20614e;
        f0Var.c();
        this.f20642b = qVar.d2(f0Var.f20613c, 2);
        c0 c0Var = this.f20643c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
