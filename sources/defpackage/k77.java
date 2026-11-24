package defpackage;

import android.content.DialogInterface;
public final class k77 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final na7 b;
    public final int c;

    public k77(na7 na7Var, int i, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                na7Var.getConnectionsManager().cancelRequest(i, true);
                return;
        }
    }
}
