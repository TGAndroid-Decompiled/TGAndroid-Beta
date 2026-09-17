package j4;

import c3.h0;
import i2.l0;
public final class k implements i {
    public static final double[] f12707r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f12708a;
    public h0 f12709b;
    public final c0 f12710c;
    public final String d;
    public final e2.v e;
    public final l0 f12711f;
    public final boolean[] f12712g = new boolean[4];
    public final j h;
    public long f12713i;
    public boolean f12714j;
    public boolean f12715k;
    public long f12716l;
    public long f12717m;
    public long f12718n;
    public long f12719o;
    public boolean f12720p;
    public boolean f12721q;

    public k(c0 c0Var, String str) {
        this.f12710c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f12711f = new l0(178);
            this.e = new e2.v();
        } else {
            this.f12711f = null;
            this.e = null;
        }
        this.f12717m = -9223372036854775807L;
        this.f12719o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f12712g);
        j jVar = this.h;
        jVar.f12704a = false;
        jVar.f12705b = 0;
        jVar.f12706c = 0;
        l0 l0Var = this.f12711f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f12713i = 0L;
        this.f12714j = false;
        this.f12717m = -9223372036854775807L;
        this.f12719o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12708a = f0Var.e;
        f0Var.b();
        this.f12709b = qVar.Z1(f0Var.d, 2);
        c0 c0Var = this.f12710c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12709b);
        if (z10) {
            boolean z11 = this.f12720p;
            this.f12709b.c(this.f12719o, z11 ? 1 : 0, (int) (this.f12713i - this.f12718n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12717m = j3;
    }
}
