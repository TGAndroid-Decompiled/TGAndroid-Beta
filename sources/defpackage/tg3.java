package defpackage;

import android.content.DialogInterface;
public final class tg3 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final uj3 b;

    public tg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.X3();
                return;
            case 1:
                if (uj3Var.Y3 != null) {
                    uj3Var.getMessagesController().v4(0L, uj3Var.Y3);
                    uj3Var.Y3 = null;
                    uj3Var.g5();
                    return;
                }
                return;
            case 2:
                uj3Var.A3(true);
                return;
            default:
                uj3Var.A3(true);
                return;
        }
    }
}
