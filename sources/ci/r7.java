package ci;

import org.telegram.messenger.Utilities;
public final class r7 implements Utilities.Callback {
    public final int f5459a;
    public final w7 f5460b;

    public r7(w7 w7Var, int i10) {
        this.f5459a = i10;
        this.f5460b = w7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f5459a) {
            case 0:
                v7 v7Var = (v7) obj;
                w7 w7Var = this.f5460b;
                w7Var.H = null;
                w7Var.E = v7Var;
                if (v7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w7Var.f5711y = z10;
                w7Var.a();
                w7Var.invalidate();
                ka kaVar = w7Var.f5703b;
                if (kaVar != null) {
                    kaVar.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                v7 v7Var2 = this.f5460b.E;
                if (v7Var2 != null || n2Var == null) {
                    v7Var2.c(n2Var);
                    return;
                }
                return;
        }
    }
}
