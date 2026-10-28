package fi;

import org.telegram.ui.yz0;
public final class lb extends nb {
    public final int f11187g;
    public final Object h;

    public lb(Object obj, int i10) {
        this.f11187g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f11187g) {
            case 0:
                yz0 yz0Var = (yz0) this.h;
                yz0Var.Q = false;
                yz0Var.invalidate();
                return;
            case 1:
                di.q4 u10 = ((di.y9) this.h).u();
                if (u10 != null) {
                    u10.k0(true);
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
        switch (this.f11187g) {
            case 0:
                yz0 yz0Var = (yz0) this.h;
                yz0Var.Q = true;
                yz0Var.invalidate();
                return;
            case 1:
                di.q4 u10 = ((di.y9) this.h).u();
                if (u10 != null) {
                    u10.k0(false);
                }
                di.q3 q3Var = this.f11324f;
                if (q3Var != null) {
                    q3Var.setTranslationX(0.0f);
                    this.f11324f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.y9) this.h).setVisibility(0);
                return;
        }
    }
}
