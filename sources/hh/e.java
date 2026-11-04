package hh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public class e implements a {
    public final e6 f14414a;
    public d f14415b;
    public d f14416c;
    public d d;
    public d f14417e;
    public float f14418f;
    public float h;
    public float f14419n;
    public float f14420r;

    public e(e6 e6Var) {
        this.f14414a = e6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.f14419n = N;
        this.f14420r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f14418f = N3;
        this.h = N4;
    }

    @Override
    public int F() {
        return 0;
    }

    @Override
    public int M() {
        return a(this.d);
    }

    @Override
    public final float O() {
        return -1.0f;
    }

    @Override
    public final float W() {
        return -1.0f;
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        e6 e6Var = this.f14414a;
        if ((e6Var instanceof ei.b) || (e6Var == null ? k6.I.q() : e6Var.a())) {
            z10 = true;
        }
        return dVar.j(e6Var, z10);
    }

    @Override
    public float a0() {
        return 0.0f;
    }

    public float b() {
        return this.f14420r;
    }

    public float c() {
        return this.f14419n;
    }

    @Override
    public int c0() {
        return 0;
    }

    public final void d(int i3, int i10) {
        this.f14415b = new c(i10, i3, 0);
    }

    public final void e(int i3, int i10) {
        this.d = new c(i10, i3, 0);
    }

    public final void f(int i3, int i10) {
        this.f14416c = new c(i10, i3, 0);
    }

    @Override
    public int u0() {
        return a(this.f14415b);
    }

    @Override
    public final int w0() {
        return a(this.f14417e);
    }

    @Override
    public int x() {
        return a(this.f14416c);
    }
}
