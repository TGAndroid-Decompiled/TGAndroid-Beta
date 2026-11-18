package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class e implements a {
    public final i6 f13625a;
    public d f13626b;
    public d f13627c;
    public d d;
    public d f13628e;
    public float f13629f;
    public float h;
    public float f13630n;
    public float f13631r;

    public e(i6 i6Var) {
        this.f13625a = i6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.f13630n = N;
        this.f13631r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f13629f = N3;
        this.h = N4;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public final int A2() {
        return a(this.f13628e);
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
        return a(this.f13626b);
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
        i6 i6Var = this.f13625a;
        if ((i6Var instanceof fi.b) || (i6Var == null ? n6.I.q() : i6Var.d())) {
            z10 = true;
        }
        return dVar.j(i6Var, z10);
    }

    public float b() {
        return this.f13631r;
    }

    public float c() {
        return this.f13630n;
    }

    public final void d(int i7, int i10) {
        this.f13626b = new c(i10, i7, 0);
    }

    public final void e(int i7, int i10) {
        this.d = new c(i10, i7, 0);
    }

    public final void f(int i7, int i10) {
        this.f13627c = new c(i10, i7, 0);
    }

    @Override
    public int t0() {
        return a(this.f13627c);
    }
}
