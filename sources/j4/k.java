package j4;

import c3.i0;
import i2.o0;
public final class k implements i {
    public static final double[] f12670r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f12671a;
    public i0 f12672b;
    public final c0 f12673c;
    public final String d;
    public final e2.x e;
    public final o0 f12674f;
    public final boolean[] f12675g = new boolean[4];
    public final j h;
    public long f12676i;
    public boolean f12677j;
    public boolean f12678k;
    public long f12679l;
    public long f12680m;
    public long f12681n;
    public long f12682o;
    public boolean f12683p;
    public boolean f12684q;

    public k(c0 c0Var, String str) {
        this.f12673c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f12674f = new o0(178);
            this.e = new e2.x();
        } else {
            this.f12674f = null;
            this.e = null;
        }
        this.f12680m = -9223372036854775807L;
        this.f12682o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.p.b(this.f12675g);
        j jVar = this.h;
        jVar.f12667a = false;
        jVar.f12668b = 0;
        jVar.f12669c = 0;
        o0 o0Var = this.f12674f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f12676i = 0L;
        this.f12677j = false;
        this.f12680m = -9223372036854775807L;
        this.f12682o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12671a = (String) f0Var.e;
        f0Var.c();
        this.f12672b = qVar.W(f0Var.f12647c, 2);
        c0 c0Var = this.f12673c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f12672b.getClass();
        if (z10) {
            boolean z11 = this.f12683p;
            this.f12672b.c(this.f12682o, z11 ? 1 : 0, (int) (this.f12676i - this.f12681n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12680m = j10;
    }
}
