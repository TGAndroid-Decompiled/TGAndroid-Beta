package ei;

import org.telegram.ui.rz0;
public final class ob extends qb {
    public final int f9584g;
    public final Object h;

    public ob(Object obj, int i10) {
        this.f9584g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f9584g) {
            case 0:
                rz0 rz0Var = (rz0) this.h;
                rz0Var.Q = false;
                rz0Var.invalidate();
                return;
            case 1:
                ci.p4 t10 = ((ci.z9) this.h).t();
                if (t10 != null) {
                    t10.l0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.h;
                u9Var.post(new com.google.firebase.messaging.s(u9Var, 27));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f9584g) {
            case 0:
                rz0 rz0Var = (rz0) this.h;
                rz0Var.Q = true;
                rz0Var.invalidate();
                return;
            case 1:
                ci.p4 t10 = ((ci.z9) this.h).t();
                if (t10 != null) {
                    t10.l0(false);
                }
                ci.q3 q3Var = this.f9682f;
                if (q3Var != null) {
                    q3Var.setTranslationX(0.0f);
                    this.f9682f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.u9) this.h).setVisibility(0);
                return;
        }
    }
}
