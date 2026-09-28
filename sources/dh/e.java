package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class e implements a {
    public final d6 f7721a;
    public d f7722b;
    public d f7723c;
    public d d;
    public d e;
    public float f7724f;
    public float h;
    public float f7725n;
    public float f7726r;

    public e(d6 d6Var) {
        this.f7721a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f7725n = dpf2;
        this.f7726r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f7724f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int H() {
        return b(this.e);
    }

    @Override
    public final int a() {
        return b(this.f7723c);
    }

    public final int b(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.f7721a;
        if ((d6Var instanceof ai.d) || (d6Var == null ? h6.I.q() : d6Var.a())) {
            z10 = true;
        }
        return dVar.g(d6Var, z10);
    }

    @Override
    public final int c() {
        return b(this.d);
    }

    public final void d(int i10, int i11) {
        this.f7722b = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.f7723c = new c(i11, i10, 0);
    }

    @Override
    public final int m() {
        return b(this.f7722b);
    }
}
