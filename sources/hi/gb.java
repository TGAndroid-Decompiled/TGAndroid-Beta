package hi;

import org.telegram.ui.vv0;
public final class gb extends ib {
    public final int f14560g;
    public final Object h;

    public gb(Object obj, int i7) {
        this.f14560g = i7;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f14560g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = false;
                vv0Var.invalidate();
                return;
            case 1:
                fi.z3 z10 = ((fi.f9) this.h).z();
                if (z10 != null) {
                    z10.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.h;
                p9Var.post(new w(p9Var, 21));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f14560g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = true;
                vv0Var.invalidate();
                return;
            case 1:
                fi.z3 z11 = ((fi.f9) this.h).z();
                if (z11 != null) {
                    z11.k0(false);
                }
                fi.c3 c3Var = this.f14712f;
                if (c3Var != null) {
                    c3Var.setTranslationX(0.0f);
                    this.f14712f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.p9) this.h).setVisibility(0);
                return;
        }
    }
}
