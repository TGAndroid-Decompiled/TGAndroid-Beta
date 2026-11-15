package ki;

import org.telegram.messenger.j9;
public final class y1 implements w3, j9, org.telegram.ui.ActionBar.q1 {
    public final x2 f18710a;

    public y1(x2 x2Var) {
        this.f18710a = x2Var;
    }

    @Override
    public void b(boolean z10) {
        x2 x2Var = this.f18710a;
        if (x2Var.f18662f0 && z10) {
            return;
        }
        x2Var.o(true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f18710a.o(false);
    }

    @Override
    public Object o(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18710a.f18661f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
