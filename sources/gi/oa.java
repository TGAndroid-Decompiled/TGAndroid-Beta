package gi;

import org.telegram.ui.nv0;
public final class oa extends qa {
    public final int f13351g;
    public final Object h;

    public oa(Object obj, int i3) {
        this.f13351g = i3;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f13351g) {
            case 0:
                nv0 nv0Var = (nv0) this.h;
                nv0Var.R = false;
                nv0Var.invalidate();
                return;
            case 1:
                ei.j4 H = ((ei.r9) this.h).H();
                if (H != null) {
                    H.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.h;
                k9Var.post(new f6(k9Var, 8));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f13351g) {
            case 0:
                nv0 nv0Var = (nv0) this.h;
                nv0Var.R = true;
                nv0Var.invalidate();
                return;
            case 1:
                ei.j4 H = ((ei.r9) this.h).H();
                if (H != null) {
                    H.k0(false);
                }
                ei.m3 m3Var = this.f13456f;
                if (m3Var != null) {
                    m3Var.setTranslationX(0.0f);
                    this.f13456f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.k9) this.h).setVisibility(0);
                return;
        }
    }
}
