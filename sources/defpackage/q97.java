package defpackage;

import android.content.DialogInterface;
public final class q97 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final uc7 b;
    public final int c;

    public q97(uc7 uc7Var, int i, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                uc7Var.getConnectionsManager().cancelRequest(i, true);
                return;
        }
    }
}
