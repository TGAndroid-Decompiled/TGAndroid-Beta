package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
public final class bk3 implements Runnable {
    public final byte a = 1;
    public final dk3 b;
    public final ub7 c;
    public final boolean d;

    public bk3(dk3 dk3Var, ub7 ub7Var, boolean z) {
        this.b = dk3Var;
        this.c = ub7Var;
        this.d = z;
    }

    @Override
    public final void run() {
        d qf4Var;
        byte b = this.a;
        boolean z = this.d;
        ub7 ub7Var = this.c;
        dk3 dk3Var = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var = dk3Var.b;
                if (z) {
                    qf4Var = new FiltersSetupActivity();
                } else {
                    qf4Var = new qf4(ub7Var, null);
                }
                nk3Var.presentFragment(qf4Var);
                return;
            default:
                dk3Var.b.getMessagesController().Q4(ub7Var, !z);
                return;
        }
    }

    public bk3(dk3 dk3Var, boolean z, ub7 ub7Var) {
        this.b = dk3Var;
        this.d = z;
        this.c = ub7Var;
    }
}
