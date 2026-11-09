package hi;

import org.telegram.messenger.k9;
public final class u3 implements org.telegram.ui.ActionBar.r1, a4, k9 {
    public final c4 f14980a;

    public u3(c4 c4Var) {
        this.f14980a = c4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f14980a.f39071b.dismiss();
    }

    @Override
    public Object j(Object obj) {
        boolean z9;
        Void r22 = (Void) obj;
        if (this.f14980a.f39071b.f33022l3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override
    public void q(boolean z9) {
        c4 c4Var = this.f14980a;
        if (!c4Var.O()) {
            c4Var.J.e(0.0f);
        }
    }
}
