package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class e implements a {
    public final u6 f10480a;
    public d f10481b;
    public d f10482c;
    public d d;
    public d e;
    public float f10483f;
    public float h;
    public float f10484n;
    public float f10485r;

    public e(u6 u6Var) {
        this.f10480a = u6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f10484n = dpf2;
        this.f10485r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f10483f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int A() {
        return a(this.d);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        u6 u6Var = this.f10480a;
        if ((u6Var instanceof di.b) || (u6Var == null ? y6.I.q() : u6Var.a())) {
            z10 = true;
        }
        return dVar.i(u6Var, z10);
    }

    public final void b(int i10, int i11) {
        this.f10481b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f10482c = new c(i11, i10, 0);
    }

    @Override
    public final int f0() {
        return a(this.f10481b);
    }

    @Override
    public final int t() {
        return a(this.f10482c);
    }

    @Override
    public final int v0() {
        return a(this.e);
    }
}
