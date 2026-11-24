package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
public final class ri3 implements Runnable {
    public final byte a = 1;
    public final ti3 b;
    public final t97 c;
    public final boolean d;

    public ri3(ti3 ti3Var, t97 t97Var, boolean z) {
        this.b = ti3Var;
        this.c = t97Var;
        this.d = z;
    }

    @Override
    public final void run() {
        d pd4Var;
        byte b = this.a;
        boolean z = this.d;
        t97 t97Var = this.c;
        ti3 ti3Var = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var = ti3Var.b;
                if (z) {
                    pd4Var = new FiltersSetupActivity();
                } else {
                    pd4Var = new pd4(t97Var, null);
                }
                cj3Var.presentFragment(pd4Var);
                return;
            default:
                ti3Var.b.getMessagesController().N4(t97Var, !z);
                return;
        }
    }

    public ri3(ti3 ti3Var, boolean z, t97 t97Var) {
        this.b = ti3Var;
        this.d = z;
        this.c = t97Var;
    }
}
