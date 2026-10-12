package di;

import org.telegram.messenger.Utilities;
public final class o7 implements Utilities.Callback {
    public final int f7561a;
    public final s7 f7562b;

    public o7(s7 s7Var, int i10) {
        this.f7561a = i10;
        this.f7562b = s7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f7561a) {
            case 0:
                r7 r7Var = (r7) obj;
                s7 s7Var = this.f7562b;
                s7Var.H = null;
                s7Var.E = r7Var;
                if (r7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s7Var.f7781y = z10;
                s7Var.a();
                s7Var.invalidate();
                ga gaVar = s7Var.f7773b;
                if (gaVar != null) {
                    gaVar.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                r7 r7Var2 = this.f7562b.E;
                if (r7Var2 != null || m2Var == null) {
                    r7Var2.c(m2Var);
                    return;
                }
                return;
        }
    }
}
