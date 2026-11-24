package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
public final class ek3 implements Runnable {
    public final byte a;
    public final gk3 b;

    public ek3(gk3 gk3Var, byte b) {
        this.a = b;
        this.b = gk3Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        gk3 gk3Var = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var = gk3Var.u0;
                Context context = gk3Var.getContext();
                i = ((d) nk3Var).currentAccount;
                nk3Var.showDialog(new i46(3, i, null, context, nk3Var));
                return;
            default:
                nk3 nk3Var2 = gk3Var.u0;
                fj3 fj3Var = nk3Var2.N0;
                if (fj3Var != null) {
                    fj3Var.dismiss();
                    nk3Var2.N0 = null;
                    return;
                }
                return;
        }
    }
}
