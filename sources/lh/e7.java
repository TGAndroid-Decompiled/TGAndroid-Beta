package lh;

import org.telegram.messenger.Utilities;

public final class e7 implements Utilities.Callback {

    public final int f15936a;

    public final i7 f15937b;

    public e7(i7 i7Var, int i10) {
        this.f15936a = i10;
        this.f15937b = i7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15936a) {
            case 0:
                h7 h7Var = (h7) obj;
                i7 i7Var = this.f15937b;
                i7Var.D = null;
                i7Var.A = h7Var;
                i7Var.f16127y = h7Var != null;
                i7Var.a();
                i7Var.invalidate();
                s9 s9Var = i7Var.f16118b;
                if (s9Var != null) {
                    s9Var.run();
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                h7 h7Var2 = this.f15937b.A;
                if (h7Var2 != null || n2Var == null) {
                    h7Var2.c(n2Var);
                }
                break;
        }
    }
}
