package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class e implements a {
    public final d6 f8657a;
    public d f8658b;
    public d f8659c;
    public d d;
    public d e;
    public float f8660f;
    public float h;
    public float f8661n;
    public float f8662r;

    public e(d6 d6Var) {
        this.f8657a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8661n = dpf2;
        this.f8662r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8660f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int E() {
        return a(this.f8658b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.f8657a;
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
        this.f8658b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f8659c = new c(i11, i10, 0);
    }

    @Override
    public final int h() {
        return a(this.f8659c);
    }

    @Override
    public final int u() {
        return a(this.d);
    }
}
