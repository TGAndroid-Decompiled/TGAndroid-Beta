package m4;

import di.t6;
import f3.j0;
public final class v implements i {
    public String f19828e;
    public j0 f19829f;
    public boolean f19831i;
    public int f19833k;
    public int f19834l;
    public int f19836n;
    public int f19837o;
    public int f19841s;
    public boolean f19843u;
    public int d = 0;
    public final h2.x f19825a = new h2.x(new byte[15], 2);
    public final d4.f f19826b = new d4.f();
    public final h2.x f19827c = new h2.x();
    public final t6 f19838p = new t6();
    public int f19839q = -2147483647;
    public int f19840r = -1;
    public long f19842t = -1;
    public boolean f19832j = true;
    public boolean f19835m = true;
    public double f19830g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(h2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: m4.v.c(h2.x):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f19834l = 0;
        this.f19825a.K(2);
        this.f19836n = 0;
        this.f19837o = 0;
        this.f19839q = -2147483647;
        this.f19840r = -1;
        this.f19841s = 0;
        this.f19842t = -1L;
        this.f19843u = false;
        this.f19831i = false;
        this.f19835m = true;
        this.f19832j = true;
        this.f19830g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19833k = i7;
        if (!this.f19832j && (this.f19837o != 0 || !this.f19835m)) {
            this.f19831i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f19831i) {
                this.h = j3;
            } else {
                this.f19830g = j3;
            }
        }
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19828e = (String) g0Var.f19679e;
        g0Var.c();
        this.f19829f = qVar.O1(g0Var.f19678c, 1);
    }

    @Override
    public final void e(boolean z9) {
    }
}
