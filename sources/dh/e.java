package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class e implements a {
    public final c6 f8360a;
    public d f8361b;
    public d f8362c;
    public d d;
    public d f8363e;
    public float f8364f;
    public float h;
    public float f8365n;
    public float f8366r;

    public e(c6 c6Var) {
        this.f8360a = c6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f8365n = dpf2;
        this.f8366r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f8364f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int C() {
        return a(this.f8363e);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        c6 c6Var = this.f8360a;
        if ((c6Var instanceof ai.d) || (c6Var == null ? h6.I.q() : c6Var.a())) {
            z10 = true;
        }
        return dVar.g(c6Var, z10);
    }

    @Override
    public final int b() {
        return a(this.f8362c);
    }

    public final void c(int i10, int i11) {
        this.f8361b = new c(i11, i10, 0);
    }

    @Override
    public final int d() {
        return a(this.d);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.f8362c = new c(i11, i10, 0);
    }

    @Override
    public final int v() {
        return a(this.f8361b);
    }
}
