package hi;

import org.telegram.messenger.x10;
public final class k6 implements x10 {
    public final int f14866a;
    public final o6 f14867b;

    public k6(o6 o6Var, int i7) {
        this.f14866a = i7;
        this.f14867b = o6Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        switch (this.f14866a) {
            case 0:
                n6 n6Var = (n6) obj;
                o6 o6Var = this.f14867b;
                o6Var.I = null;
                o6Var.F = n6Var;
                if (n6Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o6Var.E = z10;
                o6Var.a();
                o6Var.invalidate();
                s8 s8Var = o6Var.f15171b;
                if (s8Var != null) {
                    s8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                n6 n6Var2 = this.f14867b.F;
                if (n6Var2 != null || h2Var == null) {
                    n6Var2.c(h2Var);
                    return;
                }
                return;
        }
    }
}
