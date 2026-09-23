package ci;

import org.telegram.ui.f01;
public final class ec extends gc {
    public final int f4662g;
    public final Object h;

    public ec(Object obj, int i10) {
        this.f4662g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f4662g) {
            case 0:
                f01 f01Var = (f01) this.h;
                f01Var.Q = false;
                f01Var.invalidate();
                return;
            case 1:
                ai.e6 t10 = ((ai.jc) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.h;
                w9Var.post(new androidx.fragment.app.a0(w9Var, 27));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f4662g) {
            case 0:
                f01 f01Var = (f01) this.h;
                f01Var.Q = true;
                f01Var.invalidate();
                return;
            case 1:
                ai.e6 t10 = ((ai.jc) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ai.a5 a5Var = this.f4738f;
                if (a5Var != null) {
                    a5Var.setTranslationX(0.0f);
                    this.f4738f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.w9) this.h).setVisibility(0);
                return;
        }
    }
}
