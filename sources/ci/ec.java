package ci;

import org.telegram.ui.l01;
public final class ec extends gc {
    public final int f5056g;
    public final Object h;

    public ec(Object obj, int i10) {
        this.f5056g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f5056g) {
            case 0:
                l01 l01Var = (l01) this.h;
                l01Var.Q = false;
                l01Var.invalidate();
                return;
            case 1:
                ai.f6 t10 = ((ai.kc) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.h;
                y9Var.post(new androidx.fragment.app.a0(y9Var, 27));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f5056g) {
            case 0:
                l01 l01Var = (l01) this.h;
                l01Var.Q = true;
                l01Var.invalidate();
                return;
            case 1:
                ai.f6 t10 = ((ai.kc) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ai.b5 b5Var = this.f5137f;
                if (b5Var != null) {
                    b5Var.setTranslationX(0.0f);
                    this.f5137f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.y9) this.h).setVisibility(0);
                return;
        }
    }
}
