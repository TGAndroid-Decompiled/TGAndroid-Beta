package defpackage;

import android.content.DialogInterface;
public final class me6 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final qe6 b;

    public me6(qe6 qe6Var, byte b) {
        this.a = b;
        this.b = qe6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        qe6 qe6Var = this.b;
        switch (b) {
            case 0:
                qe6Var.v0.finishFragment();
                return;
            default:
                qe6Var.v0.finishFragment();
                return;
        }
    }
}
