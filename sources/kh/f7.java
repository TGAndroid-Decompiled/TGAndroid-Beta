package kh;

import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f15236a;
    public final k7 f15237b;

    public f7(k7 k7Var, int i9) {
        this.f15236a = i9;
        this.f15237b = k7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f15236a) {
            case 0:
                j7 j7Var = (j7) obj;
                k7 k7Var = this.f15237b;
                k7Var.D = null;
                k7Var.A = j7Var;
                if (j7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k7Var.f15538y = z10;
                k7Var.a();
                k7Var.invalidate();
                v9 v9Var = k7Var.f15529b;
                if (v9Var != null) {
                    v9Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                j7 j7Var2 = this.f15237b.A;
                if (j7Var2 != null || o2Var == null) {
                    j7Var2.c(o2Var);
                    return;
                }
                return;
        }
    }
}
