package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public class e implements a {
    public final h6 f13617a;
    public d f13618b;
    public d f13619c;
    public d d;
    public d f13620e;
    public float f13621f;
    public float h;
    public float f13622n;
    public float f13623r;

    public e(h6 h6Var) {
        this.f13617a = h6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.f13622n = N;
        this.f13623r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f13621f = N3;
        this.h = N4;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public final int A2() {
        return a(this.f13620e);
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public int U0() {
        return a(this.d);
    }

    @Override
    public int W1() {
        return a(this.f13618b);
    }

    @Override
    public final float Y0() {
        return -1.0f;
    }

    @Override
    public final float Z0() {
        return -1.0f;
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        h6 h6Var = this.f13617a;
        if ((h6Var instanceof fi.b) || (h6Var == null ? m6.I.q() : h6Var.d())) {
            z10 = true;
        }
        return dVar.j(h6Var, z10);
    }

    public float b() {
        return this.f13623r;
    }

    public float c() {
        return this.f13622n;
    }

    public final void d(int i7, int i10) {
        this.f13618b = new c(i10, i7, 0);
    }

    public final void e(int i7, int i10) {
        this.d = new c(i10, i7, 0);
    }

    public final void f(int i7, int i10) {
        this.f13619c = new c(i10, i7, 0);
    }

    @Override
    public int t0() {
        return a(this.f13619c);
    }
}
