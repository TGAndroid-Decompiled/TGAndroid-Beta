package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class tv5 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final k5 b;
    public final int c;

    public tv5(k5 k5Var, int i, byte b) {
        this.a = b;
        this.b = k5Var;
        this.c = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(this.b.a).cancelRequest(this.c, true);
                return;
            default:
                ConnectionsManager.getInstance(this.b.a).cancelRequest(this.c, true);
                return;
        }
    }
}
