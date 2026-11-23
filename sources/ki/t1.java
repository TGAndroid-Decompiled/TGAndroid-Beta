package ki;

import org.telegram.messenger.i9;
public final class t1 implements r3, i9, org.telegram.ui.ActionBar.q1 {
    public final t2 f19011a;

    public t1(t2 t2Var) {
        this.f19011a = t2Var;
    }

    @Override
    public void b(boolean z10) {
        t2 t2Var = this.f19011a;
        if (t2Var.f19026f0 && z10) {
            return;
        }
        t2Var.o(true);
    }

    @Override
    public Object h(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f19011a.f19025f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f19011a.o(false);
    }
}
