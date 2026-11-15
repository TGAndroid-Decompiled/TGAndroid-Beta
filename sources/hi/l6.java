package hi;

import org.telegram.messenger.z10;
public final class l6 implements z10 {
    public final int f14587a;
    public final p6 f14588b;

    public l6(p6 p6Var, int i7) {
        this.f14587a = i7;
        this.f14588b = p6Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        switch (this.f14587a) {
            case 0:
                o6 o6Var = (o6) obj;
                p6 p6Var = this.f14588b;
                p6Var.I = null;
                p6Var.F = o6Var;
                if (o6Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p6Var.E = z10;
                p6Var.a();
                p6Var.invalidate();
                s8 s8Var = p6Var.f14857b;
                if (s8Var != null) {
                    s8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                o6 o6Var2 = this.f14588b.F;
                if (o6Var2 != null || e2Var == null) {
                    o6Var2.c(e2Var);
                    return;
                }
                return;
        }
    }
}
