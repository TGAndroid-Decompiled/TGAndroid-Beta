package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public class e implements a {
    public final h6 f13970a;
    public d f13971b;
    public d f13972c;
    public d d;
    public d f13973e;
    public float f13974f;
    public float h;
    public float f13975n;
    public float f13976r;

    public e(h6 h6Var) {
        this.f13970a = h6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.f13975n = N;
        this.f13976r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f13974f = N3;
        this.h = N4;
    }

    @Override
    public int A() {
        return a(this.f13972c);
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
        return a(this.f13971b);
    }

    public final int a(d dVar) {
        boolean z9 = false;
        if (dVar == null) {
            return 0;
        }
        h6 h6Var = this.f13970a;
        if ((h6Var instanceof di.b) || (h6Var == null ? m6.I.q() : h6Var.a())) {
            z9 = true;
        }
        return dVar.k(h6Var, z9);
    }

    public float b() {
        return this.f13976r;
    }

    public float c() {
        return this.f13975n;
    }

    public final void d(int i7, int i10) {
        this.f13971b = new c(i10, i7, 0);
    }

    public final void e(int i7, int i10) {
        this.d = new c(i10, i7, 0);
    }

    @Override
    public final int e1() {
        return a(this.f13973e);
    }

    public final void f(int i7, int i10) {
        this.f13972c = new c(i10, i7, 0);
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
