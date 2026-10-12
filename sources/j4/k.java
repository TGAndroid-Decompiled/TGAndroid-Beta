package j4;

import c3.i0;
import i2.o0;
public final class k implements i {
    public static final double[] f12666r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f12667a;
    public i0 f12668b;
    public final c0 f12669c;
    public final String d;
    public final e2.x e;
    public final o0 f12670f;
    public final boolean[] f12671g = new boolean[4];
    public final j h;
    public long f12672i;
    public boolean f12673j;
    public boolean f12674k;
    public long f12675l;
    public long f12676m;
    public long f12677n;
    public long f12678o;
    public boolean f12679p;
    public boolean f12680q;

    public k(c0 c0Var, String str) {
        this.f12669c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f12670f = new o0(178);
            this.e = new e2.x();
        } else {
            this.f12670f = null;
            this.e = null;
        }
        this.f12676m = -9223372036854775807L;
        this.f12678o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.p.b(this.f12671g);
        j jVar = this.h;
        jVar.f12663a = false;
        jVar.f12664b = 0;
        jVar.f12665c = 0;
        o0 o0Var = this.f12670f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f12672i = 0L;
        this.f12673j = false;
        this.f12676m = -9223372036854775807L;
        this.f12678o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12667a = (String) f0Var.e;
        f0Var.c();
        this.f12668b = qVar.a0(f0Var.f12643c, 2);
        c0 c0Var = this.f12669c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f12668b.getClass();
        if (z10) {
            boolean z11 = this.f12679p;
            this.f12668b.c(this.f12678o, z11 ? 1 : 0, (int) (this.f12672i - this.f12677n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12676m = j10;
    }
}
