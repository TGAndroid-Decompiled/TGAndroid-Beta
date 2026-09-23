package j4;

import c3.h0;
import i2.m0;
public final class k implements i {
    public static final double[] f12696r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f12697a;
    public h0 f12698b;
    public final c0 f12699c;
    public final String d;
    public final e2.v e;
    public final m0 f12700f;
    public final boolean[] f12701g = new boolean[4];
    public final j h;
    public long f12702i;
    public boolean f12703j;
    public boolean f12704k;
    public long f12705l;
    public long f12706m;
    public long f12707n;
    public long f12708o;
    public boolean f12709p;
    public boolean f12710q;

    public k(c0 c0Var, String str) {
        this.f12699c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f12700f = new m0(178);
            this.e = new e2.v();
        } else {
            this.f12700f = null;
            this.e = null;
        }
        this.f12706m = -9223372036854775807L;
        this.f12708o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f12701g);
        j jVar = this.h;
        jVar.f12693a = false;
        jVar.f12694b = 0;
        jVar.f12695c = 0;
        m0 m0Var = this.f12700f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f12702i = 0L;
        this.f12703j = false;
        this.f12706m = -9223372036854775807L;
        this.f12708o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12697a = f0Var.e;
        f0Var.b();
        this.f12698b = qVar.Z1(f0Var.d, 2);
        c0 c0Var = this.f12699c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12698b);
        if (z10) {
            boolean z11 = this.f12709p;
            this.f12698b.c(this.f12708o, z11 ? 1 : 0, (int) (this.f12702i - this.f12707n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12706m = j3;
    }
}
