package ci;

import org.telegram.ui.m01;
public final class hc extends jc {
    public final int f4765g;
    public final Object h;

    public hc(Object obj, int i10) {
        this.f4765g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f4765g) {
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
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.h;
                u9Var.post(new androidx.fragment.app.a0(u9Var, 27));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f4765g) {
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
                ai.a5 a5Var = this.f4858f;
                if (a5Var != null) {
                    a5Var.setTranslationX(0.0f);
                    this.f4858f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.u9) this.h).setVisibility(0);
                return;
        }
    }
}
