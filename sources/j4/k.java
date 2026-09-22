package j4;

import c3.h0;
import i2.l0;
public final class k implements i {
    public static final double[] f12706r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f12707a;
    public h0 f12708b;
    public final c0 f12709c;
    public final String d;
    public final e2.v e;
    public final l0 f12710f;
    public final boolean[] f12711g = new boolean[4];
    public final j h;
    public long f12712i;
    public boolean f12713j;
    public boolean f12714k;
    public long f12715l;
    public long f12716m;
    public long f12717n;
    public long f12718o;
    public boolean f12719p;
    public boolean f12720q;

    public k(c0 c0Var, String str) {
        this.f12709c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f12710f = new l0(178);
            this.e = new e2.v();
        } else {
            this.f12710f = null;
            this.e = null;
        }
        this.f12716m = -9223372036854775807L;
        this.f12718o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f12711g);
        j jVar = this.h;
        jVar.f12703a = false;
        jVar.f12704b = 0;
        jVar.f12705c = 0;
        l0 l0Var = this.f12710f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f12712i = 0L;
        this.f12713j = false;
        this.f12716m = -9223372036854775807L;
        this.f12718o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12707a = f0Var.e;
        f0Var.b();
        this.f12708b = qVar.Z1(f0Var.d, 2);
        c0 c0Var = this.f12709c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12708b);
        if (z10) {
            boolean z11 = this.f12719p;
            this.f12708b.c(this.f12718o, z11 ? 1 : 0, (int) (this.f12712i - this.f12717n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12716m = j3;
    }
}
