package ei;

import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f9059a;
    public final j7 f9060b;

    public f7(j7 j7Var, int i10) {
        this.f9059a = i10;
        this.f9060b = j7Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f9059a) {
            case 0:
                i7 i7Var = (i7) obj;
                j7 j7Var = this.f9060b;
                j7Var.H = null;
                j7Var.E = i7Var;
                if (i7Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j7Var.f9277y = z10;
                j7Var.a();
                j7Var.invalidate();
                t9 t9Var = j7Var.f9269b;
                if (t9Var != null) {
                    t9Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                i7 i7Var2 = this.f9060b.E;
                if (i7Var2 != null || o2Var == null) {
                    i7Var2.c(o2Var);
                    return;
                }
                return;
        }
    }
}
