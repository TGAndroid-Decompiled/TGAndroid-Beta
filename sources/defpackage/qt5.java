package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class qt5 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final j5 b;
    public final int c;

    public qt5(j5 j5Var, int i, byte b) {
        this.a = b;
        this.b = j5Var;
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
