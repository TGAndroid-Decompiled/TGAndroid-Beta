package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
public final class ui3 implements Runnable {
    public final byte a;
    public final vi3 b;

    public ui3(vi3 vi3Var, byte b) {
        this.a = b;
        this.b = vi3Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        vi3 vi3Var = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var = vi3Var.u0;
                Context context = vi3Var.getContext();
                i = ((d) cj3Var).currentAccount;
                cj3Var.showDialog(new h26(3, i, null, context, cj3Var));
                return;
            default:
                cj3 cj3Var2 = vi3Var.u0;
                th3 th3Var = cj3Var2.N0;
                if (th3Var != null) {
                    th3Var.dismiss();
                    cj3Var2.N0 = null;
                    return;
                }
                return;
        }
    }
}
