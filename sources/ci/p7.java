package ci;

import org.telegram.messenger.Utilities;
public final class p7 implements Utilities.Callback {
    public final int f5299a;
    public final t7 f5300b;

    public p7(t7 t7Var, int i10) {
        this.f5299a = i10;
        this.f5300b = t7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f5299a) {
            case 0:
                s7 s7Var = (s7) obj;
                t7 t7Var = this.f5300b;
                t7Var.H = null;
                t7Var.E = s7Var;
                if (s7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t7Var.f5565y = z10;
                t7Var.a();
                t7Var.invalidate();
                ha haVar = t7Var.f5557b;
                if (haVar != null) {
                    haVar.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                s7 s7Var2 = this.f5300b.E;
                if (s7Var2 != null || n2Var == null) {
                    s7Var2.c(n2Var);
                    return;
                }
                return;
        }
    }
}
