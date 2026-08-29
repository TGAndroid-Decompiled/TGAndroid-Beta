package nh;

import org.telegram.ui.iz0;
public final class za extends bb {
    public final int f18970g;
    public final Object h;

    public za(Object obj, int i10) {
        this.f18970g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f18970g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = false;
                iz0Var.invalidate();
                return;
            case 1:
                lh.d4 t10 = ((lh.i9) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.h;
                t9Var.post(new m6(t9Var, 8));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f18970g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = true;
                iz0Var.invalidate();
                return;
            case 1:
                lh.d4 t10 = ((lh.i9) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                lh.h3 h3Var = this.f17448f;
                if (h3Var != null) {
                    h3Var.setTranslationX(0.0f);
                    this.f17448f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.t9) this.h).setVisibility(0);
                return;
        }
    }
}
