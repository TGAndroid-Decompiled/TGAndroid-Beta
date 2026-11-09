package fi;

import org.telegram.ui.yv0;
public final class oa extends qa {
    public final int f12567g;
    public final Object h;

    public oa(Object obj, int i7) {
        this.f12567g = i7;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f12567g) {
            case 0:
                yv0 yv0Var = (yv0) this.h;
                yv0Var.Q = false;
                yv0Var.invalidate();
                return;
            case 1:
                di.j4 z9 = ((di.q9) this.h).z();
                if (z9 != null) {
                    z9.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.h;
                l9Var.post(new v9(l9Var, 3));
                return;
        }
    }

    @Override
    public final void f(boolean z9) {
        switch (this.f12567g) {
            case 0:
                yv0 yv0Var = (yv0) this.h;
                yv0Var.Q = true;
                yv0Var.invalidate();
                return;
            case 1:
                di.j4 z10 = ((di.q9) this.h).z();
                if (z10 != null) {
                    z10.k0(false);
                }
                di.j3 j3Var = this.f12690f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f12690f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.l9) this.h).setVisibility(0);
                return;
        }
    }
}
