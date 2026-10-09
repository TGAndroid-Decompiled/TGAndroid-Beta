package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class e implements a {
    public final e6 f8363a;
    public d f8364b;
    public d f8365c;
    public d d;
    public d f8366e;
    public float f8367f;
    public float h;
    public float f8368n;
    public float f8369r;

    public e(e6 e6Var) {
        this.f8363a = e6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8368n = dpf2;
        this.f8369r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8367f = dpf23;
        this.h = dpf24;
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        e6 e6Var = this.f8363a;
        if ((e6Var instanceof ai.d) || (e6Var == null ? i6.I.q() : e6Var.a())) {
            z10 = true;
        }
        return dVar.g(e6Var, z10);
    }

    public final void b(int i10, int i11) {
        this.f8364b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    @Override
    public final int d() {
        return a(this.f8365c);
    }

    public final void e(int i10, int i11) {
        this.f8365c = new c(i11, i10, 0);
    }

    @Override
    public final int m() {
        return a(this.d);
    }

    @Override
    public final int q() {
        return a(this.f8364b);
    }

    @Override
    public final int x() {
        return a(this.f8366e);
    }
}
