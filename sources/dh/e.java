package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class e implements a {
    public final e6 f7723a;
    public d f7724b;
    public d f7725c;
    public d d;
    public d e;
    public float f7726f;
    public float h;
    public float f7727n;
    public float f7728r;

    public e(e6 e6Var) {
        this.f7723a = e6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f7727n = dpf2;
        this.f7728r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f7726f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int B() {
        return b(this.e);
    }

    @Override
    public final int a() {
        return b(this.f7725c);
    }

    public final int b(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        e6 e6Var = this.f7723a;
        if ((e6Var instanceof ai.d) || (e6Var == null ? i6.I.q() : e6Var.a())) {
            z10 = true;
        }
        return dVar.h(e6Var, z10);
    }

    @Override
    public final int c() {
        return b(this.d);
    }

    public final void d(int i10, int i11) {
        this.f7724b = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.f7725c = new c(i11, i10, 0);
    }

    @Override
    public final int m() {
        return b(this.f7724b);
    }
}
