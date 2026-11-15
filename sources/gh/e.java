package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public class e implements a {
    public final e6 f13310a;
    public d f13311b;
    public d f13312c;
    public d d;
    public d f13313e;
    public float f13314f;
    public float h;
    public float f13315n;
    public float f13316r;

    public e(e6 e6Var) {
        this.f13310a = e6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.f13315n = N;
        this.f13316r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f13314f = N3;
        this.h = N4;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public final int A2() {
        return a(this.f13313e);
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
        return a(this.f13311b);
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
        e6 e6Var = this.f13310a;
        if ((e6Var instanceof fi.b) || (e6Var == null ? j6.I.q() : e6Var.a())) {
            z10 = true;
        }
        return dVar.j(e6Var, z10);
    }

    public float b() {
        return this.f13316r;
    }

    public float c() {
        return this.f13315n;
    }

    public final void d(int i7, int i10) {
        this.f13311b = new c(i10, i7, 0);
    }

    public final void e(int i7, int i10) {
        this.d = new c(i10, i7, 0);
    }

    public final void f(int i7, int i10) {
        this.f13312c = new c(i10, i7, 0);
    }

    @Override
    public int t0() {
        return a(this.f13312c);
    }
}
