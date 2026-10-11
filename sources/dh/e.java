package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class e implements a {
    public final d6 f8362a;
    public d f8363b;
    public d f8364c;
    public d d;
    public d f8365e;
    public float f8366f;
    public float h;
    public float f8367n;
    public float f8368r;

    public e(d6 d6Var) {
        this.f8362a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8367n = dpf2;
        this.f8368r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8366f = dpf23;
        this.h = dpf24;
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.f8362a;
        if ((d6Var instanceof ai.d) || (d6Var == null ? h6.I.q() : d6Var.a())) {
            z10 = true;
        }
        return dVar.g(d6Var, z10);
    }

    public final void b(int i10, int i11) {
        this.f8363b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    @Override
    public final int d() {
        return a(this.f8364c);
    }

    public final void e(int i10, int i11) {
        this.f8364c = new c(i11, i10, 0);
    }

    @Override
    public final int m() {
        return a(this.d);
    }

    @Override
    public final int q() {
        return a(this.f8363b);
    }

    @Override
    public final int x() {
        return a(this.f8365e);
    }
}
