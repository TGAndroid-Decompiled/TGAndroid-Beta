package m4;

import di.s6;
import f3.j0;
public final class v implements i {
    public String f19820e;
    public j0 f19821f;
    public boolean f19823i;
    public int f19825k;
    public int f19826l;
    public int f19828n;
    public int f19829o;
    public int f19833s;
    public boolean f19835u;
    public int d = 0;
    public final h2.x f19817a = new h2.x(new byte[15], 2);
    public final d4.f f19818b = new d4.f();
    public final h2.x f19819c = new h2.x();
    public final s6 f19830p = new s6();
    public int f19831q = -2147483647;
    public int f19832r = -1;
    public long f19834t = -1;
    public boolean f19824j = true;
    public boolean f19827m = true;
    public double f19822g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(h2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: m4.v.c(h2.x):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f19826l = 0;
        this.f19817a.K(2);
        this.f19828n = 0;
        this.f19829o = 0;
        this.f19831q = -2147483647;
        this.f19832r = -1;
        this.f19833s = 0;
        this.f19834t = -1L;
        this.f19835u = false;
        this.f19823i = false;
        this.f19827m = true;
        this.f19824j = true;
        this.f19822g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19825k = i7;
        if (!this.f19824j && (this.f19829o != 0 || !this.f19827m)) {
            this.f19823i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f19823i) {
                this.h = j3;
            } else {
                this.f19822g = j3;
            }
        }
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19820e = (String) g0Var.f19671e;
        g0Var.c();
        this.f19821f = qVar.O1(g0Var.f19670c, 1);
    }

    @Override
    public final void e(boolean z9) {
    }
}
