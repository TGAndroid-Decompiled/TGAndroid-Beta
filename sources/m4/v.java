package m4;

import f3.i0;
import fi.j6;
public final class v implements i {
    public String f20806e;
    public i0 f20807f;
    public boolean f20809i;
    public int f20811k;
    public int f20812l;
    public int f20814n;
    public int f20815o;
    public int f20819s;
    public boolean f20821u;
    public int d = 0;
    public final h2.x f20803a = new h2.x(new byte[15], 2);
    public final d4.f f20804b = new d4.f();
    public final h2.x f20805c = new h2.x();
    public final j6 f20816p = new j6();
    public int f20817q = -2147483647;
    public int f20818r = -1;
    public long f20820t = -1;
    public boolean f20810j = true;
    public boolean f20813m = true;
    public double f20808g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(h2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: m4.v.c(h2.x):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f20812l = 0;
        this.f20803a.K(2);
        this.f20814n = 0;
        this.f20815o = 0;
        this.f20817q = -2147483647;
        this.f20818r = -1;
        this.f20819s = 0;
        this.f20820t = -1L;
        this.f20821u = false;
        this.f20809i = false;
        this.f20813m = true;
        this.f20810j = true;
        this.f20808g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20811k = i7;
        if (!this.f20810j && (this.f20815o != 0 || !this.f20813m)) {
            this.f20809i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f20809i) {
                this.h = j3;
            } else {
                this.f20808g = j3;
            }
        }
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20806e = (String) f0Var.f20642e;
        f0Var.c();
        this.f20807f = qVar.d2(f0Var.f20641c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
