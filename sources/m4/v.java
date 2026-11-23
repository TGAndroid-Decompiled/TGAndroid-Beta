package m4;

import f3.i0;
import fi.j6;
public final class v implements i {
    public String f20809e;
    public i0 f20810f;
    public boolean f20812i;
    public int f20814k;
    public int f20815l;
    public int f20817n;
    public int f20818o;
    public int f20822s;
    public boolean f20824u;
    public int d = 0;
    public final h2.x f20806a = new h2.x(new byte[15], 2);
    public final d4.f f20807b = new d4.f();
    public final h2.x f20808c = new h2.x();
    public final j6 f20819p = new j6();
    public int f20820q = -2147483647;
    public int f20821r = -1;
    public long f20823t = -1;
    public boolean f20813j = true;
    public boolean f20816m = true;
    public double f20811g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(h2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: m4.v.c(h2.x):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f20815l = 0;
        this.f20806a.K(2);
        this.f20817n = 0;
        this.f20818o = 0;
        this.f20820q = -2147483647;
        this.f20821r = -1;
        this.f20822s = 0;
        this.f20823t = -1L;
        this.f20824u = false;
        this.f20812i = false;
        this.f20816m = true;
        this.f20813j = true;
        this.f20811g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20814k = i7;
        if (!this.f20813j && (this.f20818o != 0 || !this.f20816m)) {
            this.f20812i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f20812i) {
                this.h = j3;
            } else {
                this.f20811g = j3;
            }
        }
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20809e = (String) f0Var.f20645e;
        f0Var.c();
        this.f20810f = qVar.d2(f0Var.f20644c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
