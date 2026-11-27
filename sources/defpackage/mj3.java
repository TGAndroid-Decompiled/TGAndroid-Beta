package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.e;
public final class mj3 implements Runnable {
    public final byte a;
    public final nj3 b;

    public mj3(nj3 nj3Var, byte b) {
        this.a = b;
        this.b = nj3Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        nj3 nj3Var = this.b;
        switch (b) {
            case 0:
                uj3 uj3Var = nj3Var.o0;
                Context context = nj3Var.getContext();
                i = ((e) uj3Var).currentAccount;
                uj3Var.showDialog(new l46(3, i, null, context, uj3Var));
                return;
            default:
                uj3 uj3Var2 = nj3Var.o0;
                ni3 ni3Var = uj3Var2.N0;
                if (ni3Var != null) {
                    ni3Var.dismiss();
                    uj3Var2.N0 = null;
                    return;
                }
                return;
        }
    }
}
