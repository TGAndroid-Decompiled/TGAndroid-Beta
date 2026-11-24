package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fu0 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;
    public final Object c;

    public fu0(Object obj, int i, byte b) {
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
                ConnectionsManager.getInstance(((ku0) obj).a).cancelRequest(i, true);
                return;
            case 1:
                ((uf1) obj).h0(i);
                return;
            case 2:
                ((iv1) obj).a.getConnectionsManager().cancelRequest(i, true);
                return;
            case 3:
                int i2 = ChatActivityEnterView.z7;
                ((ChatActivityEnterView) obj).F3.getConnectionsManager().cancelRequest(i, true);
                return;
            case 4:
                ba2 ba2Var = (ba2) obj;
                ba2Var.O0 = false;
                ba2Var.b = null;
                ba2Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((e24) ((b24) obj).c.b).G.d1).cancelRequest(i, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((g95) obj).n1.a).cancelRequest(i, true);
                return;
            case 7:
                ((pc6) obj).getConnectionsManager().cancelRequest(i, true);
                return;
            case 8:
                ((dw9) obj).getConnectionsManager().cancelRequest(i, true);
                return;
            default:
                ((zob) obj).d0(i);
                return;
        }
    }
}
