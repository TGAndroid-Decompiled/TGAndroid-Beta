package hi;

import org.telegram.ui.xv0;
public final class ma extends oa {
    public final int f15023g;
    public final Object h;

    public ma(Object obj, int i7) {
        this.f15023g = i7;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f15023g) {
            case 0:
                xv0 xv0Var = (xv0) this.h;
                xv0Var.R = false;
                xv0Var.invalidate();
                return;
            case 1:
                fi.z3 z10 = ((fi.f9) this.h).z();
                if (z10 != null) {
                    z10.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) this.h;
                q9Var.post(new b0(q9Var, 20));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f15023g) {
            case 0:
                xv0 xv0Var = (xv0) this.h;
                xv0Var.R = true;
                xv0Var.invalidate();
                return;
            case 1:
                fi.z3 z11 = ((fi.f9) this.h).z();
                if (z11 != null) {
                    z11.k0(false);
                }
                fi.c3 c3Var = this.f15161f;
                if (c3Var != null) {
                    c3Var.setTranslationX(0.0f);
                    this.f15161f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.q9) this.h).setVisibility(0);
                return;
        }
    }
}
