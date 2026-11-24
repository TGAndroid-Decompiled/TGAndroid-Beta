package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xs0 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;
    public final Object c;

    public xs0(Object obj, int i, byte b) {
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
                ConnectionsManager.getInstance(((ct0) obj).a).cancelRequest(i, true);
                return;
            case 1:
                ((me1) obj).g0(i);
                return;
            case 2:
                ((wt1) obj).a.getConnectionsManager().cancelRequest(i, true);
                return;
            case 3:
                int i2 = ChatActivityEnterView.r7;
                ((ChatActivityEnterView) obj).F3.getConnectionsManager().cancelRequest(i, true);
                return;
            case 4:
                p82 p82Var = (p82) obj;
                p82Var.O0 = false;
                p82Var.b = null;
                p82Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((t04) ((q04) obj).c.b).G.d1).cancelRequest(i, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((h75) obj).n1.a).cancelRequest(i, true);
                return;
            case 7:
                ((qa6) obj).getConnectionsManager().cancelRequest(i, true);
                return;
            case 8:
                ((bu9) obj).getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                ((ymb) obj).c0(i);
                return;
        }
    }
}
