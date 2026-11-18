package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class e implements a {
    public final i6 f13622a;
    public d f13623b;
    public d f13624c;
    public d d;
    public d f13625e;
    public float f13626f;
    public float h;
    public float f13627n;
    public float f13628r;

    public e(i6 i6Var) {
        this.f13622a = i6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.f13627n = N;
        this.f13628r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f13626f = N3;
        this.h = N4;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public final int A2() {
        return a(this.f13625e);
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
        return a(this.f13623b);
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
        i6 i6Var = this.f13622a;
        if ((i6Var instanceof fi.b) || (i6Var == null ? n6.I.q() : i6Var.d())) {
            z10 = true;
        }
        return dVar.j(i6Var, z10);
    }

    public float b() {
        return this.f13628r;
    }

    public float c() {
        return this.f13627n;
    }

    public final void d(int i7, int i10) {
        this.f13623b = new c(i10, i7, 0);
    }

    public final void e(int i7, int i10) {
        this.d = new c(i10, i7, 0);
    }

    public final void f(int i7, int i10) {
        this.f13624c = new c(i10, i7, 0);
    }

    @Override
    public int t0() {
        return a(this.f13624c);
    }
}
