package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public class e implements a {
    public final g6 f13968a;
    public d f13969b;
    public d f13970c;
    public d d;
    public d f13971e;
    public float f13972f;
    public float h;
    public float f13973n;
    public float f13974r;

    public e(g6 g6Var) {
        this.f13968a = g6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.f13973n = N;
        this.f13974r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f13972f = N3;
        this.h = N4;
    }

    @Override
    public int A() {
        return a(this.f13970c);
    }

    @Override
    public int C0() {
        return 0;
    }

    @Override
    public int M() {
        return 0;
    }

    @Override
    public int O() {
        return a(this.d);
    }

    @Override
    public int R0() {
        return a(this.f13969b);
    }

    public final int a(d dVar) {
        boolean z9 = false;
        if (dVar == null) {
            return 0;
        }
        g6 g6Var = this.f13968a;
        if ((g6Var instanceof di.b) || (g6Var == null ? l6.I.q() : g6Var.a())) {
            z9 = true;
        }
        return dVar.k(g6Var, z9);
    }

    public float b() {
        return this.f13974r;
    }

    public float c() {
        return this.f13973n;
    }

    public final void d(int i7, int i10) {
        this.f13969b = new c(i10, i7, 0);
    }

    public final void e(int i7, int i10) {
        this.d = new c(i10, i7, 0);
    }

    @Override
    public final int e1() {
        return a(this.f13971e);
    }

    public final void f(int i7, int i10) {
        this.f13970c = new c(i10, i7, 0);
    }

    @Override
    public final float j0() {
        return -1.0f;
    }

    @Override
    public final float o0() {
        return -1.0f;
    }

    @Override
    public float v0() {
        return 0.0f;
    }
}
