package hi;

import org.telegram.messenger.w10;
public final class t6 implements w10 {
    public final int f15439a;
    public final x6 f15440b;

    public t6(x6 x6Var, int i7) {
        this.f15439a = i7;
        this.f15440b = x6Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        switch (this.f15439a) {
            case 0:
                w6 w6Var = (w6) obj;
                x6 x6Var = this.f15440b;
                x6Var.I = null;
                x6Var.F = w6Var;
                if (w6Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x6Var.E = z10;
                x6Var.a();
                x6Var.invalidate();
                m9 m9Var = x6Var.f15723b;
                if (m9Var != null) {
                    m9Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                w6 w6Var2 = this.f15440b.F;
                if (w6Var2 != null || g2Var == null) {
                    w6Var2.c(g2Var);
                    return;
                }
                return;
        }
    }
}
