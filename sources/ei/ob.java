package ei;

import org.telegram.ui.qz0;
public final class ob extends qb {
    public final int f9573g;
    public final Object h;

    public ob(Object obj, int i10) {
        this.f9573g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f9573g) {
            case 0:
                qz0 qz0Var = (qz0) this.h;
                qz0Var.Q = false;
                qz0Var.invalidate();
                return;
            case 1:
                ci.q4 t10 = ((ci.aa) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.h;
                w9Var.post(new com.google.firebase.messaging.s(w9Var, 27));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f9573g) {
            case 0:
                qz0 qz0Var = (qz0) this.h;
                qz0Var.Q = true;
                qz0Var.invalidate();
                return;
            case 1:
                ci.q4 t10 = ((ci.aa) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ci.r3 r3Var = this.f9669f;
                if (r3Var != null) {
                    r3Var.setTranslationX(0.0f);
                    this.f9669f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.w9) this.h).setVisibility(0);
                return;
        }
    }
}
