package defpackage;

import android.content.DialogInterface;
public final class cp9 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final pp9 b;

    public cp9(pp9 pp9Var, byte b) {
        this.a = b;
        this.b = pp9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        pp9 pp9Var = this.b;
        switch (b) {
            case 0:
                pp9Var.K0 = null;
                return;
            default:
                pp9Var.dismiss();
                return;
        }
    }
}
