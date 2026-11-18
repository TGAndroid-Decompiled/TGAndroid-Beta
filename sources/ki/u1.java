package ki;

import org.telegram.messenger.i9;
public final class u1 implements r3, i9, org.telegram.ui.ActionBar.r1 {
    public final t2 f18974a;

    public u1(t2 t2Var) {
        this.f18974a = t2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f18974a.o(false);
    }

    @Override
    public Object m(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18974a.f18930f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void s(boolean z10) {
        t2 t2Var = this.f18974a;
        if (t2Var.f18931f0 && z10) {
            return;
        }
        t2Var.o(true);
    }
}
