package ii;

import org.telegram.messenger.e9;
public final class y1 implements b4, e9, org.telegram.ui.ActionBar.p1 {
    public final a3 f15330a;

    public y1(a3 a3Var) {
        this.f15330a = a3Var;
    }

    @Override
    public void a(boolean z10) {
        a3 a3Var = this.f15330a;
        if (a3Var.f14803f0 && z10) {
            return;
        }
        a3Var.o(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f15330a.o(false);
    }

    @Override
    public Object k(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f15330a.f14802f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
