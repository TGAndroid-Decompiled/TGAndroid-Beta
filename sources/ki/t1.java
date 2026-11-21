package ki;

import org.telegram.messenger.i9;
public final class t1 implements q3, i9, org.telegram.ui.ActionBar.q1 {
    public final s2 f18981a;

    public t1(s2 s2Var) {
        this.f18981a = s2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f18981a.o(false);
    }

    @Override
    public Object m(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18981a.f18937f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void s(boolean z10) {
        s2 s2Var = this.f18981a;
        if (s2Var.f18938f0 && z10) {
            return;
        }
        s2Var.o(true);
    }
}
