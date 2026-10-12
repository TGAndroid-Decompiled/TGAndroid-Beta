package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class e implements a {
    public final c6 f8776a;
    public d f8777b;
    public d f8778c;
    public d d;
    public d e;
    public float f8779f;
    public float h;
    public float f8780n;
    public float f8781r;

    public e(c6 c6Var) {
        this.f8776a = c6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8780n = dpf2;
        this.f8781r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8779f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int G() {
        return a(this.f8777b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        c6 c6Var = this.f8776a;
        if ((c6Var instanceof bi.b) || (c6Var == null ? g6.I.q() : c6Var.a())) {
            z10 = true;
        }
        return dVar.f(c6Var, z10);
    }

    public final void b(int i10, int i11) {
        this.f8777b = new c(i11, i10, 0);
    }

    @Override
    public final int b0() {
        return a(this.e);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f8778c = new c(i11, i10, 0);
    }

    @Override
    public final int h() {
        return a(this.f8778c);
    }

    @Override
    public final int q() {
        return a(this.d);
    }
}
