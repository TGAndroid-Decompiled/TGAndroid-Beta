package fi;

import org.telegram.messenger.Utilities;
public final class c7 implements Utilities.Callback {
    public final int f10612a;
    public final g7 f10613b;

    public c7(g7 g7Var, int i10) {
        this.f10612a = i10;
        this.f10613b = g7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f10612a) {
            case 0:
                f7 f7Var = (f7) obj;
                g7 g7Var = this.f10613b;
                g7Var.H = null;
                g7Var.E = f7Var;
                if (f7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.f10916y = z10;
                g7Var.a();
                g7Var.invalidate();
                p9 p9Var = g7Var.f10908b;
                if (p9Var != null) {
                    p9Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                f7 f7Var2 = this.f10613b.E;
                if (f7Var2 != null || r2Var == null) {
                    f7Var2.c(r2Var);
                    return;
                }
                return;
        }
    }
}
