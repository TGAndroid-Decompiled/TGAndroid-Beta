package ci;

import org.telegram.ui.m01;
public final class hc extends jc {
    public final int f4771g;
    public final Object h;

    public hc(Object obj, int i10) {
        this.f4771g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f4771g) {
            case 0:
                m01 m01Var = (m01) this.h;
                m01Var.Q = false;
                m01Var.invalidate();
                return;
            case 1:
                ai.f6 t10 = ((ai.jc) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.h;
                v9Var.post(new androidx.fragment.app.a0(v9Var, 27));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f4771g) {
            case 0:
                m01 m01Var = (m01) this.h;
                m01Var.Q = true;
                m01Var.invalidate();
                return;
            case 1:
                ai.f6 t10 = ((ai.jc) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ai.a5 a5Var = this.f4864f;
                if (a5Var != null) {
                    a5Var.setTranslationX(0.0f);
                    this.f4864f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.v9) this.h).setVisibility(0);
                return;
        }
    }
}
