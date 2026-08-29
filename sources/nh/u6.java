package nh;

import org.telegram.messenger.Utilities;
public final class u6 implements Utilities.Callback {
    public final int f18722a;
    public final y6 f18723b;

    public u6(y6 y6Var, int i10) {
        this.f18722a = i10;
        this.f18723b = y6Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f18722a) {
            case 0:
                x6 x6Var = (x6) obj;
                y6 y6Var = this.f18723b;
                y6Var.D = null;
                y6Var.A = x6Var;
                if (x6Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y6Var.f18889y = z10;
                y6Var.a();
                y6Var.invalidate();
                g9 g9Var = y6Var.f18880b;
                if (g9Var != null) {
                    g9Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                x6 x6Var2 = this.f18723b.A;
                if (x6Var2 != null || o2Var == null) {
                    x6Var2.c(o2Var);
                    return;
                }
                return;
        }
    }
}
