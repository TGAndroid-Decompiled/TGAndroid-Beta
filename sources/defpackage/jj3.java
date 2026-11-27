package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
public final class jj3 implements Runnable {
    public final byte a = 1;
    public final lj3 b;
    public final ac7 c;
    public final boolean d;

    public jj3(lj3 lj3Var, ac7 ac7Var, boolean z) {
        this.b = lj3Var;
        this.c = ac7Var;
        this.d = z;
    }

    @Override
    public final void run() {
        e nf4Var;
        byte b = this.a;
        boolean z = this.d;
        ac7 ac7Var = this.c;
        lj3 lj3Var = this.b;
        switch (b) {
            case 0:
                uj3 uj3Var = lj3Var.b;
                if (z) {
                    nf4Var = new FiltersSetupActivity();
                } else {
                    nf4Var = new nf4(ac7Var, null);
                }
                uj3Var.presentFragment(nf4Var);
                return;
            default:
                lj3Var.b.getMessagesController().W4(ac7Var, !z);
                return;
        }
    }

    public jj3(lj3 lj3Var, boolean z, ac7 ac7Var) {
        this.b = lj3Var;
        this.d = z;
        this.c = ac7Var;
    }
}
