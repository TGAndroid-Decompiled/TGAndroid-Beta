package bi;

import org.telegram.messenger.Utilities;
public final class s8 implements Utilities.Callback {
    public final int f3653a;
    public final x8 f3654b;

    public s8(x8 x8Var, int i10) {
        this.f3653a = i10;
        this.f3654b = x8Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f3653a) {
            case 0:
                w8 w8Var = (w8) obj;
                x8 x8Var = this.f3654b;
                x8Var.H = null;
                x8Var.E = w8Var;
                if (w8Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x8Var.f3929y = z10;
                x8Var.a();
                x8Var.invalidate();
                tb tbVar = x8Var.f3921b;
                if (tbVar != null) {
                    tbVar.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                w8 w8Var2 = this.f3654b.E;
                if (w8Var2 != null || p2Var == null) {
                    w8Var2.c(p2Var);
                    return;
                }
                return;
        }
    }
}
