package j4;

import c3.h0;
import i2.l0;
public final class k implements i {
    public static final double[] f12708r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f12709a;
    public h0 f12710b;
    public final c0 f12711c;
    public final String d;
    public final e2.v e;
    public final l0 f12712f;
    public final boolean[] f12713g = new boolean[4];
    public final j h;
    public long f12714i;
    public boolean f12715j;
    public boolean f12716k;
    public long f12717l;
    public long f12718m;
    public long f12719n;
    public long f12720o;
    public boolean f12721p;
    public boolean f12722q;

    public k(c0 c0Var, String str) {
        this.f12711c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f12712f = new l0(178);
            this.e = new e2.v();
        } else {
            this.f12712f = null;
            this.e = null;
        }
        this.f12718m = -9223372036854775807L;
        this.f12720o = -9223372036854775807L;
    }

    @Override
    public final void b(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.o.a(this.f12713g);
        j jVar = this.h;
        jVar.f12705a = false;
        jVar.f12706b = 0;
        jVar.f12707c = 0;
        l0 l0Var = this.f12712f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f12714i = 0L;
        this.f12715j = false;
        this.f12718m = -9223372036854775807L;
        this.f12720o = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12709a = f0Var.e;
        f0Var.b();
        this.f12710b = qVar.Z1(f0Var.d, 2);
        c0 c0Var = this.f12711c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f12710b);
        if (z10) {
            boolean z11 = this.f12721p;
            this.f12710b.c(this.f12720o, z11 ? 1 : 0, (int) (this.f12714i - this.f12719n), 0, null);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f12718m = j3;
    }
}
