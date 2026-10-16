package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class e implements a {
    public final c6 f8779a;
    public d f8780b;
    public d f8781c;
    public d d;
    public d e;
    public float f8782f;
    public float h;
    public float f8783n;
    public float f8784r;

    public e(c6 c6Var) {
        this.f8779a = c6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8783n = dpf2;
        this.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8782f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int J() {
        return a(this.f8780b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        c6 c6Var = this.f8779a;
        if ((c6Var instanceof bi.b) || (c6Var == null ? g6.I.q() : c6Var.a())) {
            z10 = true;
        }
        return dVar.f(c6Var, z10);
    }

    public final void b(int i10, int i11) {
        this.f8780b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f8781c = new c(i11, i10, 0);
    }

    @Override
    public final int j0() {
        return a(this.e);
    }

    @Override
    public final int k() {
        return a(this.f8781c);
    }

    @Override
    public final int w() {
        return a(this.d);
    }
}
