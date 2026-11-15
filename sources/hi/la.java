package hi;

import org.telegram.ui.vv0;
public final class la extends na {
    public final int f14611g;
    public final Object h;

    public la(Object obj, int i7) {
        this.f14611g = i7;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f14611g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = false;
                vv0Var.invalidate();
                return;
            case 1:
                fi.b4 z10 = ((fi.i9) this.h).z();
                if (z10 != null) {
                    z10.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) this.h;
                i9Var.post(new e1(i9Var, 17));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f14611g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = true;
                vv0Var.invalidate();
                return;
            case 1:
                fi.b4 z11 = ((fi.i9) this.h).z();
                if (z11 != null) {
                    z11.k0(false);
                }
                fi.e3 e3Var = this.f14785f;
                if (e3Var != null) {
                    e3Var.setTranslationX(0.0f);
                    this.f14785f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.i9) this.h).setVisibility(0);
                return;
        }
    }
}
