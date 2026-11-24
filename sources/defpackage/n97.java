package defpackage;

import android.content.DialogInterface;
public final class n97 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final oc7 b;
    public final int c;

    public n97(oc7 oc7Var, int i, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                oc7Var.getConnectionsManager().cancelRequest(i, true);
                return;
        }
    }
}
