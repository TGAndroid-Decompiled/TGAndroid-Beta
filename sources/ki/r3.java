package ki;

import org.telegram.messenger.j9;
public final class r3 implements org.telegram.ui.ActionBar.q1, w3, j9 {
    public final y3 f18533a;

    public r3(y3 y3Var) {
        this.f18533a = y3Var;
    }

    @Override
    public void b(boolean z10) {
        y3 y3Var = this.f18533a;
        if (!y3Var.P()) {
            y3Var.K.e(0.0f);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f18533a.f33607b.dismiss();
    }

    @Override
    public Object o(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18533a.f33607b.f36482p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
