package ei;

import org.telegram.ui.sz0;
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
                sz0 sz0Var = (sz0) this.h;
                sz0Var.Q = false;
                sz0Var.invalidate();
                return;
            case 1:
                ci.p4 t10 = ((ci.z9) this.h).t();
                if (t10 != null) {
                    t10.l0(true);
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
        switch (this.f9584g) {
            case 0:
                sz0 sz0Var = (sz0) this.h;
                sz0Var.Q = true;
                sz0Var.invalidate();
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
                ((org.telegram.ui.Components.w9) this.h).setVisibility(0);
                return;
        }
    }
}
