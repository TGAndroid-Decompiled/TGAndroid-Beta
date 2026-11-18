package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.qx;
import org.telegram.ui.a81;
import org.telegram.ui.f40;
import org.telegram.ui.mm;
import org.telegram.ui.pa0;
import org.telegram.ui.rn;
public final class z implements DialogInterface.OnCancelListener {
    public final int f10102a;
    public final int f10103b;
    public final Object f10104c;

    public z(Object obj, int i7, int i10) {
        this.f10102a = i10;
        this.f10104c = obj;
        this.f10103b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10102a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f10104c).f8685a).cancelRequest(this.f10103b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f10104c).currentAccount).cancelRequest(this.f10103b, true);
                return;
            case 2:
                ((mm) this.f10104c).f49922a.getConnectionsManager().cancelRequest(this.f10103b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f10104c;
                rnVar.O0 = false;
                rnVar.f51677b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f10103b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f10104c).D3.getConnectionsManager().cancelRequest(this.f10103b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((qx) ((nx) this.f10104c).f37869c.f2781b).G.f39345d1).cancelRequest(this.f10103b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((f40) this.f10104c).f47498o1.f23221a).cancelRequest(this.f10103b, true);
                return;
            case 7:
                ((pa0) this.f10104c).getConnectionsManager().cancelRequest(this.f10103b, true);
                return;
            default:
                ConnectionsManager.getInstance(((a81) this.f10104c).currentAccount).cancelRequest(this.f10103b, true);
                return;
        }
    }
}
