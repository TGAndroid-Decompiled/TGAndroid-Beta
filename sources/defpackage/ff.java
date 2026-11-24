package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ff implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public ff(int i, int[] iArr, hb5 hb5Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = iArr;
        this.d = hb5Var;
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
                vm1 vm1Var = (vm1) obj;
                for (int i2 : (int[]) obj2) {
                    if (i2 != 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                    }
                }
                if (vm1Var != null) {
                    vm1Var.run();
                    return;
                }
                return;
            case 1:
                hb5 hb5Var = (hb5) obj;
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i).cancelRequest(((int[]) obj2)[0], true);
                if (hb5Var != null) {
                    hb5Var.run();
                    return;
                }
                return;
            default:
                ((na7) obj2).getConnectionsManager().cancelRequest(i, true);
                ((d) obj).setVisibleDialog(null);
                return;
        }
    }

    public ff(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
