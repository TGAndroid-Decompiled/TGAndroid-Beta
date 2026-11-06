package fi;

import org.telegram.ui.wv0;
public final class oa extends qa {
    public final int f12569g;
    public final Object h;

    public oa(Object obj, int i7) {
        this.f12569g = i7;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f12569g) {
            case 0:
                wv0 wv0Var = (wv0) this.h;
                wv0Var.Q = false;
                wv0Var.invalidate();
                return;
            case 1:
                di.i4 z9 = ((di.p9) this.h).z();
                if (z9 != null) {
                    z9.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.h;
                l9Var.post(new h9(l9Var, 4));
                return;
        }
    }

    @Override
    public final void f(boolean z9) {
        switch (this.f12569g) {
            case 0:
                wv0 wv0Var = (wv0) this.h;
                wv0Var.Q = true;
                wv0Var.invalidate();
                return;
            case 1:
                di.i4 z10 = ((di.p9) this.h).z();
                if (z10 != null) {
                    z10.k0(false);
                }
                di.j3 j3Var = this.f12689f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f12689f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.l9) this.h).setVisibility(0);
                return;
        }
    }
}
