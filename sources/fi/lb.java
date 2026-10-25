package fi;

import org.telegram.ui.wz0;
public final class lb extends nb {
    public final int f11188g;
    public final Object h;

    public lb(Object obj, int i10) {
        this.f11188g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f11188g) {
            case 0:
                wz0 wz0Var = (wz0) this.h;
                wz0Var.Q = false;
                wz0Var.invalidate();
                return;
            case 1:
                di.q4 t10 = ((di.y9) this.h).t();
                if (t10 != null) {
                    t10.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.h;
                y9Var.post(new ua(y9Var, 1));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f11188g) {
            case 0:
                wz0 wz0Var = (wz0) this.h;
                wz0Var.Q = true;
                wz0Var.invalidate();
                return;
            case 1:
                di.q4 t10 = ((di.y9) this.h).t();
                if (t10 != null) {
                    t10.k0(false);
                }
                di.q3 q3Var = this.f11325f;
                if (q3Var != null) {
                    q3Var.setTranslationX(0.0f);
                    this.f11325f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.y9) this.h).setVisibility(0);
                return;
        }
    }
}
