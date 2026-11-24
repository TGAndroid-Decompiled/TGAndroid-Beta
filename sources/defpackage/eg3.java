package defpackage;

import android.content.DialogInterface;
public final class eg3 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final cj3 b;

    public eg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                if (cj3Var.W3 != null) {
                    cj3Var.getMessagesController().m4(0L, cj3Var.W3);
                    cj3Var.W3 = null;
                    cj3Var.c5();
                    return;
                }
                return;
            case 1:
                cj3Var.y3(true);
                return;
            case 2:
                cj3Var.y3(true);
                return;
            default:
                cj3Var.U3();
                return;
        }
    }
}
