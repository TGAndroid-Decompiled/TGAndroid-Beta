package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class e implements a {
    public final d6 f8659a;
    public d f8660b;
    public d f8661c;
    public d d;
    public d e;
    public float f8662f;
    public float h;
    public float f8663n;
    public float f8664r;

    public e(d6 d6Var) {
        this.f8659a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8663n = dpf2;
        this.f8664r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8662f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int E() {
        return a(this.f8660b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.f8659a;
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
        this.f8660b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f8661c = new c(i11, i10, 0);
    }

    @Override
    public final int h() {
        return a(this.f8661c);
    }

    @Override
    public final int u() {
        return a(this.d);
    }
}
