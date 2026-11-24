package defpackage;

import android.content.DialogInterface;
public final class p91 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final ia1 b;
    public final int c;

    public p91(ia1 ia1Var, int i, byte b) {
        this.a = b;
        this.b = ia1Var;
        this.c = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        ia1 ia1Var = this.b;
        switch (b) {
            case 0:
                ia1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                ia1Var.getConnectionsManager().cancelRequest(i, true);
                return;
        }
    }
}
