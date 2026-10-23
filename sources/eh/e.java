package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class e implements a {
    public final g6 f8665a;
    public d f8666b;
    public d f8667c;
    public d d;
    public d e;
    public float f8668f;
    public float h;
    public float f8669n;
    public float f8670r;

    public e(g6 g6Var) {
        this.f8665a = g6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8669n = dpf2;
        this.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8668f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int H() {
        return a(this.f8666b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        g6 g6Var = this.f8665a;
        if ((g6Var instanceof ci.b) || (g6Var == null ? k6.I.q() : g6Var.a())) {
            z10 = true;
        }
        return dVar.i(g6Var, z10);
    }

    @Override
    public final int a0() {
        return a(this.e);
    }

    public final void b(int i10, int i11) {
        this.f8666b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f8667c = new c(i11, i10, 0);
    }

    @Override
    public final int h() {
        return a(this.f8667c);
    }

    @Override
    public final int u() {
        return a(this.d);
    }
}
