package fi;

import org.telegram.ui.zv0;
public final class oa extends qa {
    public final int f12571g;
    public final Object h;

    public oa(Object obj, int i7) {
        this.f12571g = i7;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f12571g) {
            case 0:
                zv0 zv0Var = (zv0) this.h;
                zv0Var.Q = false;
                zv0Var.invalidate();
                return;
            case 1:
                di.j4 z9 = ((di.q9) this.h).z();
                if (z9 != null) {
                    z9.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.h;
                k9Var.post(new v9(k9Var, 3));
                return;
        }
    }

    @Override
    public final void f(boolean z9) {
        switch (this.f12571g) {
            case 0:
                zv0 zv0Var = (zv0) this.h;
                zv0Var.Q = true;
                zv0Var.invalidate();
                return;
            case 1:
                di.j4 z10 = ((di.q9) this.h).z();
                if (z10 != null) {
                    z10.k0(false);
                }
                di.j3 j3Var = this.f12694f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f12694f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.k9) this.h).setVisibility(0);
                return;
        }
    }
}
