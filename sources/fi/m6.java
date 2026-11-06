package fi;

import org.telegram.messenger.c20;
public final class m6 implements c20 {
    public final int f12453a;
    public final q6 f12454b;

    public m6(q6 q6Var, int i7) {
        this.f12453a = i7;
        this.f12454b = q6Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        switch (this.f12453a) {
            case 0:
                p6 p6Var = (p6) obj;
                q6 q6Var = this.f12454b;
                q6Var.H = null;
                q6Var.E = p6Var;
                if (p6Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q6Var.D = z9;
                q6Var.a();
                q6Var.invalidate();
                u8 u8Var = q6Var.f12665b;
                if (u8Var != null) {
                    u8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                p6 p6Var2 = this.f12454b.E;
                if (p6Var2 != null || f2Var == null) {
                    p6Var2.c(f2Var);
                    return;
                }
                return;
        }
    }
}
