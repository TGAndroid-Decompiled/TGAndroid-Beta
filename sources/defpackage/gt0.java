package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gt0 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;
    public final Object c;

    public gt0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(((kt0) obj).a).cancelRequest(i, true);
                return;
            case 1:
                ((ve1) obj).g0(i);
                return;
            case 2:
                ((ju1) obj).a.getConnectionsManager().cancelRequest(i, true);
                return;
            case 3:
                int i2 = ChatActivityEnterView.X7;
                ((ChatActivityEnterView) obj).E3.getConnectionsManager().cancelRequest(i, true);
                return;
            case 4:
                g92 g92Var = (g92) obj;
                g92Var.O0 = false;
                g92Var.b = null;
                g92Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((o14) ((l14) obj).c.b).G.d1).cancelRequest(i, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((j95) obj).n1.a).cancelRequest(i, true);
                return;
            case 7:
                ((uc6) obj).getConnectionsManager().cancelRequest(i, true);
                return;
            case 8:
                ((wx9) obj).getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                ((xqb) obj).c0(i);
                return;
        }
    }
}
