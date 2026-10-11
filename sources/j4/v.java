package j4;

import ai.g9;
import c3.h0;
public final class v implements i {
    public String f13972e;
    public h0 f13973f;
    public boolean f13975i;
    public int f13977k;
    public int f13978l;
    public int f13980n;
    public int f13981o;
    public int f13985s;
    public boolean f13987u;
    public int d = 0;
    public final e2.v f13969a = new e2.v(new byte[15], 2);
    public final a4.g f13970b = new a4.g();
    public final e2.v f13971c = new e2.v();
    public final g9 f13982p = new Object();
    public int f13983q = -2147483647;
    public int f13984r = -1;
    public long f13986t = -1;
    public boolean f13976j = true;
    public boolean f13979m = true;
    public double f13974g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void b(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.b(e2.v):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f13978l = 0;
        this.f13969a.G(2);
        this.f13980n = 0;
        this.f13981o = 0;
        this.f13983q = -2147483647;
        this.f13984r = -1;
        this.f13985s = 0;
        this.f13986t = -1L;
        this.f13987u = false;
        this.f13975i = false;
        this.f13979m = true;
        this.f13976j = true;
        this.f13974g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13972e = (String) f0Var.f13808e;
        f0Var.c();
        this.f13973f = qVar.f2(f0Var.f13807c, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13977k = i10;
        if (!this.f13976j && (this.f13981o != 0 || !this.f13979m)) {
            this.f13975i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f13975i) {
                this.h = j3;
            } else {
                this.f13974g = j3;
            }
        }
    }

    @Override
    public final void f(boolean z10) {
    }
}
