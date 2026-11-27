package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class ef implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public ef(int i, int[] iArr, tg5 tg5Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = iArr;
        this.d = tg5Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int[] iArr;
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hm1 hm1Var = (hm1) obj;
                for (int i2 : (int[]) obj2) {
                    if (i2 != 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                    }
                }
                if (hm1Var != null) {
                    hm1Var.run();
                    return;
                }
                return;
            case 1:
                tg5 tg5Var = (tg5) obj;
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i).cancelRequest(((int[]) obj2)[0], true);
                if (tg5Var != null) {
                    tg5Var.run();
                    return;
                }
                return;
            default:
                ((uc7) obj2).getConnectionsManager().cancelRequest(i, true);
                ((e) obj).setVisibleDialog(null);
                return;
        }
    }

    public ef(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
