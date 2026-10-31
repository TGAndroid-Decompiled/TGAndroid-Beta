package j4;

import c3.k0;
public final class v implements i {
    public String e;
    public k0 f9627f;
    public boolean f9629i;
    public int f9631k;
    public int f9632l;
    public int f9634n;
    public int f9635o;
    public int f9639s;
    public boolean f9641u;
    public int d = 0;
    public final e2.x f9624a = new e2.x(new byte[15], 2);
    public final a4.g f9625b = new a4.g();
    public final e2.x f9626c = new e2.x();
    public final w f9636p = new w();
    public int f9637q = -2147483647;
    public int f9638r = -1;
    public long f9640t = -1;
    public boolean f9630j = true;
    public boolean f9633m = true;
    public double f9628g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.c(e2.x):void");
    }

    @Override
    public final void e() {
        this.d = 0;
        this.f9632l = 0;
        this.f9624a.K(2);
        this.f9634n = 0;
        this.f9635o = 0;
        this.f9637q = -2147483647;
        this.f9638r = -1;
        this.f9639s = 0;
        this.f9640t = -1L;
        this.f9641u = false;
        this.f9629i = false;
        this.f9633m = true;
        this.f9630j = true;
        this.f9628g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.e = (String) g0Var.e;
        g0Var.c();
        this.f9627f = qVar.I1(g0Var.f9491c, 1);
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9631k = i10;
        if (!this.f9630j && (this.f9635o != 0 || !this.f9633m)) {
            this.f9629i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f9629i) {
                this.h = j10;
            } else {
                this.f9628g = j10;
            }
        }
    }

    @Override
    public final void g(boolean z10) {
    }
}
