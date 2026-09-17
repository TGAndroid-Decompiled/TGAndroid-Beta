package di;

import org.telegram.ui.n01;
public final class ic extends kc {
    public final int f7433g;
    public final Object h;

    public ic(Object obj, int i10) {
        this.f7433g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f7433g) {
            case 0:
                n01 n01Var = (n01) this.h;
                n01Var.Q = false;
                n01Var.invalidate();
                return;
            case 1:
                bi.o5 t10 = ((bi.pb) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.h;
                x9Var.post(new nb(x9Var, 3));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f7433g) {
            case 0:
                n01 n01Var = (n01) this.h;
                n01Var.Q = true;
                n01Var.invalidate();
                return;
            case 1:
                bi.o5 t10 = ((bi.pb) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                bi.l4 l4Var = this.f7514f;
                if (l4Var != null) {
                    l4Var.setTranslationX(0.0f);
                    this.f7514f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.x9) this.h).setVisibility(0);
                return;
        }
    }
}
