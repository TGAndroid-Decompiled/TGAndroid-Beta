package bi;

import org.telegram.ui.s01;
public final class ud extends xd {
    public final int f3742g;
    public final Object h;

    public ud(Object obj, int i10) {
        this.f3742g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f3742g) {
            case 0:
                s01 s01Var = (s01) this.h;
                s01Var.Q = false;
                s01Var.invalidate();
                return;
            case 1:
                zh.a3 t10 = ((zh.u7) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.h;
                w9Var.post(new wc(w9Var, 3));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f3742g) {
            case 0:
                s01 s01Var = (s01) this.h;
                s01Var.Q = true;
                s01Var.invalidate();
                return;
            case 1:
                zh.a3 t10 = ((zh.u7) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                zh.h2 h2Var = this.f3945f;
                if (h2Var != null) {
                    h2Var.setTranslationX(0.0f);
                    this.f3945f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.w9) this.h).setVisibility(0);
                return;
        }
    }
}
