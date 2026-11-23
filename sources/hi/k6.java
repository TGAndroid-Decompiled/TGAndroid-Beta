package hi;

import org.telegram.messenger.y10;
public final class k6 implements y10 {
    public final int f14815a;
    public final o6 f14816b;

    public k6(o6 o6Var, int i7) {
        this.f14815a = i7;
        this.f14816b = o6Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        switch (this.f14815a) {
            case 0:
                n6 n6Var = (n6) obj;
                o6 o6Var = this.f14816b;
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
                s8 s8Var = o6Var.f15129b;
                if (s8Var != null) {
                    s8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                n6 n6Var2 = this.f14816b.F;
                if (n6Var2 != null || g2Var == null) {
                    n6Var2.c(g2Var);
                    return;
                }
                return;
        }
    }
}
