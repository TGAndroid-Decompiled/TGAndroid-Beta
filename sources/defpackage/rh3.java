package defpackage;

import android.content.DialogInterface;
public final class rh3 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final nk3 b;

    public rh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                if (nk3Var.Y3 != null) {
                    nk3Var.getMessagesController().p4(0L, nk3Var.Y3);
                    nk3Var.Y3 = null;
                    nk3Var.g5();
                    return;
                }
                return;
            case 1:
                nk3Var.A3(true);
                return;
            case 2:
                nk3Var.A3(true);
                return;
            default:
                nk3Var.X3();
                return;
        }
    }
}
