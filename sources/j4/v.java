package j4;

import ai.g9;
import c3.h0;
public final class v implements i {
    public String f13973e;
    public h0 f13974f;
    public boolean f13976i;
    public int f13978k;
    public int f13979l;
    public int f13981n;
    public int f13982o;
    public int f13986s;
    public boolean f13988u;
    public int d = 0;
    public final e2.v f13970a = new e2.v(new byte[15], 2);
    public final a4.g f13971b = new a4.g();
    public final e2.v f13972c = new e2.v();
    public final g9 f13983p = new Object();
    public int f13984q = -2147483647;
    public int f13985r = -1;
    public long f13987t = -1;
    public boolean f13977j = true;
    public boolean f13980m = true;
    public double f13975g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f13979l = 0;
        this.f13970a.G(2);
        this.f13981n = 0;
        this.f13982o = 0;
        this.f13984q = -2147483647;
        this.f13985r = -1;
        this.f13986s = 0;
        this.f13987t = -1L;
        this.f13988u = false;
        this.f13976i = false;
        this.f13980m = true;
        this.f13977j = true;
        this.f13975g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13973e = (String) f0Var.f13809e;
        f0Var.c();
        this.f13974f = qVar.f2(f0Var.f13808c, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13978k = i10;
        if (!this.f13977j && (this.f13982o != 0 || !this.f13980m)) {
            this.f13976i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f13976i) {
                this.h = j3;
            } else {
                this.f13975g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
