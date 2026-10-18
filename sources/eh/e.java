package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class e implements a {
    public final d6 f8658a;
    public d f8659b;
    public d f8660c;
    public d d;
    public d e;
    public float f8661f;
    public float h;
    public float f8662n;
    public float f8663r;

    public e(d6 d6Var) {
        this.f8658a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8662n = dpf2;
        this.f8663r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8661f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int E() {
        return a(this.f8659b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.f8658a;
        if ((d6Var instanceof ci.b) || (d6Var == null ? h6.I.q() : d6Var.a())) {
            z10 = true;
        }
        return dVar.f(d6Var, z10);
    }

    @Override
    public final int a0() {
        return a(this.e);
    }

    public final void b(int i10, int i11) {
        this.f8659b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f8660c = new c(i11, i10, 0);
    }

    @Override
    public final int h() {
        return a(this.f8660c);
    }

    @Override
    public final int u() {
        return a(this.d);
    }
}
