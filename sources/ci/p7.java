package ci;

import org.telegram.messenger.Utilities;
public final class p7 implements Utilities.Callback {
    public final int f5298a;
    public final t7 f5299b;

    public p7(t7 t7Var, int i10) {
        this.f5298a = i10;
        this.f5299b = t7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f5298a) {
            case 0:
                s7 s7Var = (s7) obj;
                t7 t7Var = this.f5299b;
                t7Var.H = null;
                t7Var.E = s7Var;
                if (s7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t7Var.f5572y = z10;
                t7Var.a();
                t7Var.invalidate();
                ga gaVar = t7Var.f5564b;
                if (gaVar != null) {
                    gaVar.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                s7 s7Var2 = this.f5299b.E;
                if (s7Var2 != null || o2Var == null) {
                    s7Var2.c(o2Var);
                    return;
                }
                return;
        }
    }
}
