package defpackage;

import android.content.DialogInterface;
public final class g81 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final z81 b;
    public final int c;

    public g81(z81 z81Var, int i, byte b) {
        this.a = b;
        this.b = z81Var;
        this.c = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        z81 z81Var = this.b;
        switch (b) {
            case 0:
                z81Var.getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                z81Var.getConnectionsManager().cancelRequest(i, true);
                return;
        }
    }
}
