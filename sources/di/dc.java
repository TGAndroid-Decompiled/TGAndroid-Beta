package di;

import org.telegram.ui.s01;
public final class dc extends fc {
    public final int f6848g;
    public final Object h;

    public dc(Object obj, int i10) {
        this.f6848g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f6848g) {
            case 0:
                s01 s01Var = (s01) this.h;
                s01Var.Q = false;
                s01Var.invalidate();
                return;
            case 1:
                bi.q5 t10 = ((bi.sb) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) this.h;
                z9Var.post(new x8(z9Var, 6));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f6848g) {
            case 0:
                s01 s01Var = (s01) this.h;
                s01Var.Q = true;
                s01Var.invalidate();
                return;
            case 1:
                bi.q5 t10 = ((bi.sb) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                bi.o4 o4Var = this.f6958f;
                if (o4Var != null) {
                    o4Var.setTranslationX(0.0f);
                    this.f6958f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.z9) this.h).setVisibility(0);
                return;
        }
    }
}
