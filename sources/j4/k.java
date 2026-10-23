package j4;

import c3.l0;
import i2.n0;
public final class k implements i {
    public static final double[] f14125r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f14126a;
    public l0 f14127b;
    public final c0 f14128c;
    public final String d;
    public final e2.x e;
    public final n0 f14129f;
    public final boolean[] f14130g = new boolean[4];
    public final j h;
    public long f14131i;
    public boolean f14132j;
    public boolean f14133k;
    public long f14134l;
    public long f14135m;
    public long f14136n;
    public long f14137o;
    public boolean f14138p;
    public boolean f14139q;

    public k(c0 c0Var, String str) {
        this.f14128c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f14129f = new n0(178);
            this.e = new e2.x();
        } else {
            this.f14129f = null;
            this.e = null;
        }
        this.f14135m = -9223372036854775807L;
        this.f14137o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14130g);
        j jVar = this.h;
        jVar.f14122a = false;
        jVar.f14123b = 0;
        jVar.f14124c = 0;
        n0 n0Var = this.f14129f;
        if (n0Var != null) {
            n0Var.g();
        }
        this.f14131i = 0L;
        this.f14132j = false;
        this.f14135m = -9223372036854775807L;
        this.f14137o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14126a = (String) f0Var.e;
        f0Var.c();
        this.f14127b = sVar.j0(f0Var.f14102c, 2);
        c0 c0Var = this.f14128c;
        if (c0Var != null) {
            c0Var.b(sVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f14127b.getClass();
        if (z10) {
            boolean z11 = this.f14138p;
            this.f14127b.c(this.f14137o, z11 ? 1 : 0, (int) (this.f14131i - this.f14136n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14135m = j10;
    }
}
