package hi;

import org.telegram.ui.wv0;
public final class ma extends oa {
    public final int f15039g;
    public final Object h;

    public ma(Object obj, int i7) {
        this.f15039g = i7;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f15039g) {
            case 0:
                wv0 wv0Var = (wv0) this.h;
                wv0Var.R = false;
                wv0Var.invalidate();
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
                q9Var.post(new k(q9Var, 21));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f15039g) {
            case 0:
                wv0 wv0Var = (wv0) this.h;
                wv0Var.R = true;
                wv0Var.invalidate();
                return;
            case 1:
                fi.z3 z11 = ((fi.f9) this.h).z();
                if (z11 != null) {
                    z11.k0(false);
                }
                fi.c3 c3Var = this.f15206f;
                if (c3Var != null) {
                    c3Var.setTranslationX(0.0f);
                    this.f15206f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.q9) this.h).setVisibility(0);
                return;
        }
    }
}
