package ci;

import org.telegram.messenger.Utilities;
public final class p7 implements Utilities.Callback {
    public final int f5730a;
    public final t7 f5731b;

    public p7(t7 t7Var, int i10) {
        this.f5730a = i10;
        this.f5731b = t7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f5730a) {
            case 0:
                s7 s7Var = (s7) obj;
                t7 t7Var = this.f5731b;
                t7Var.H = null;
                t7Var.E = s7Var;
                if (s7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t7Var.f6019y = z10;
                t7Var.a();
                t7Var.invalidate();
                ha haVar = t7Var.f6010b;
                if (haVar != null) {
                    haVar.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                s7 s7Var2 = this.f5731b.E;
                if (s7Var2 != null || m2Var == null) {
                    s7Var2.c(m2Var);
                    return;
                }
                return;
        }
    }
}
