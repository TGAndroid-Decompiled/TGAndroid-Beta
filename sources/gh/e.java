package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class e implements a {
    public final i6 f13617a;
    public d f13618b;
    public d f13619c;
    public d d;
    public d f13620e;
    public float f13621f;
    public float h;
    public float f13622n;
    public float f13623r;

    public e(i6 i6Var) {
        this.f13617a = i6Var;
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
    public int D0() {
        return 0;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public int Q0() {
        return a(this.d);
    }

    @Override
    public final float T0() {
        return -1.0f;
    }

    @Override
    public final float V0() {
        return -1.0f;
    }

    @Override
    public int X1() {
        return a(this.f13618b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        i6 i6Var = this.f13617a;
        if ((i6Var instanceof fi.b) || (i6Var == null ? n6.I.q() : i6Var.b())) {
            z10 = true;
        }
        return dVar.f(i6Var, z10);
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
    public int i0() {
        return a(this.f13619c);
    }

    @Override
    public final int x2() {
        return a(this.f13620e);
    }
}
