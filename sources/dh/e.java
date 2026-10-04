package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public final class e implements a {
    public final d6 f8350a;
    public d f8351b;
    public d f8352c;
    public d d;
    public d f8353e;
    public float f8354f;
    public float h;
    public float f8355n;
    public float f8356r;

    public e(d6 d6Var) {
        this.f8350a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8355n = dpf2;
        this.f8356r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8354f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int B() {
        return b(this.f8353e);
    }

    @Override
    public final int a() {
        return b(this.f8352c);
    }

    public final int b(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.f8350a;
        if ((d6Var instanceof ai.d) || (d6Var == null ? i6.I.q() : d6Var.a())) {
            z10 = true;
        }
        return dVar.h(d6Var, z10);
    }

    @Override
    public final int c() {
        return b(this.d);
    }

    public final void d(int i10, int i11) {
        this.f8351b = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.f8352c = new c(i11, i10, 0);
    }

    @Override
    public final int i() {
        return b(this.f8351b);
    }
}
