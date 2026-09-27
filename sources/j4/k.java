package j4;

import c3.h0;
import i2.m0;
public final class k implements i {
    public static final double[] f12699r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f12700a;
    public h0 f12701b;
    public final c0 f12702c;
    public final String d;
    public final e2.v e;
    public final m0 f12703f;
    public final boolean[] f12704g = new boolean[4];
    public final j h;
    public long f12705i;
    public boolean f12706j;
    public boolean f12707k;
    public long f12708l;
    public long f12709m;
    public long f12710n;
    public long f12711o;
    public boolean f12712p;
    public boolean f12713q;

    public k(c0 c0Var, String str) {
        this.f12702c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f12703f = new m0(178);
            this.e = new e2.v();
        } else {
            this.f12703f = null;
            this.e = null;
        }
        this.f12709m = -9223372036854775807L;
        this.f12711o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f12704g);
        j jVar = this.h;
        jVar.f12696a = false;
        jVar.f12697b = 0;
        jVar.f12698c = 0;
        m0 m0Var = this.f12703f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f12705i = 0L;
        this.f12706j = false;
        this.f12709m = -9223372036854775807L;
        this.f12711o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12700a = f0Var.e;
        f0Var.b();
        this.f12701b = qVar.Z1(f0Var.d, 2);
        c0 c0Var = this.f12702c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12701b);
        if (z10) {
            boolean z11 = this.f12712p;
            this.f12701b.c(this.f12711o, z11 ? 1 : 0, (int) (this.f12705i - this.f12710n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12709m = j3;
    }
}
