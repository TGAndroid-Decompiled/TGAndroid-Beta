package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class e implements a {
    public final d6 f7733a;
    public d f7734b;
    public d f7735c;
    public d d;
    public d e;
    public float f7736f;
    public float h;
    public float f7737n;
    public float f7738r;

    public e(d6 d6Var) {
        this.f7733a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f7737n = dpf2;
        this.f7738r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f7736f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int H() {
        return b(this.e);
    }

    @Override
    public final int a() {
        return b(this.f7735c);
    }

    public final int b(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.f7733a;
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
        this.f7734b = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.f7735c = new c(i11, i10, 0);
    }

    @Override
    public final int m() {
        return b(this.f7734b);
    }
}
