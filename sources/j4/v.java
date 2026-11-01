package j4;

import c3.k0;
public final class v implements i {
    public String e;
    public k0 f9628f;
    public boolean f9630i;
    public int f9632k;
    public int f9633l;
    public int f9635n;
    public int f9636o;
    public int f9640s;
    public boolean f9642u;
    public int d = 0;
    public final e2.x f9625a = new e2.x(new byte[15], 2);
    public final a4.g f9626b = new a4.g();
    public final e2.x f9627c = new e2.x();
    public final w f9637p = new w();
    public int f9638q = -2147483647;
    public int f9639r = -1;
    public long f9641t = -1;
    public boolean f9631j = true;
    public boolean f9634m = true;
    public double f9629g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.c(e2.x):void");
    }

    @Override
    public final void e() {
        this.d = 0;
        this.f9633l = 0;
        this.f9625a.K(2);
        this.f9635n = 0;
        this.f9636o = 0;
        this.f9638q = -2147483647;
        this.f9639r = -1;
        this.f9640s = 0;
        this.f9641t = -1L;
        this.f9642u = false;
        this.f9630i = false;
        this.f9634m = true;
        this.f9631j = true;
        this.f9629g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.e = (String) g0Var.e;
        g0Var.c();
        this.f9628f = qVar.I1(g0Var.f9492c, 1);
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9632k = i10;
        if (!this.f9631j && (this.f9636o != 0 || !this.f9634m)) {
            this.f9630i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f9630i) {
                this.h = j10;
            } else {
                this.f9629g = j10;
            }
        }
    }

    @Override
    public final void g(boolean z10) {
    }
}
