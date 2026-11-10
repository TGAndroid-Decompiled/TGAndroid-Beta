package hi;

import org.telegram.messenger.k9;
public final class y1 implements a4, k9, org.telegram.ui.ActionBar.r1 {
    public final a3 f15056a;

    public y1(a3 a3Var) {
        this.f15056a = a3Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f15056a.o(false);
    }

    @Override
    public Object j(Object obj) {
        boolean z9;
        Void r22 = (Void) obj;
        if (this.f15056a.f14521f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override
    public void q(boolean z9) {
        a3 a3Var = this.f15056a;
        if (a3Var.f14520e0 && z9) {
            return;
        }
        a3Var.o(true);
    }
}
