package defpackage;

import android.content.DialogInterface;
public final class n81 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final i91 b;
    public final int c;

    public n81(i91 i91Var, int i, byte b) {
        this.a = b;
        this.b = i91Var;
        this.c = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        i91 i91Var = this.b;
        switch (b) {
            case 0:
                i91Var.getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                i91Var.getConnectionsManager().cancelRequest(i, true);
                return;
        }
    }
}
