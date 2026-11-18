package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.qx;
import org.telegram.ui.a81;
import org.telegram.ui.f40;
import org.telegram.ui.mm;
import org.telegram.ui.qa0;
import org.telegram.ui.rn;
public final class z implements DialogInterface.OnCancelListener {
    public final int f10099a;
    public final int f10100b;
    public final Object f10101c;

    public z(Object obj, int i7, int i10) {
        this.f10099a = i10;
        this.f10101c = obj;
        this.f10100b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10099a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f10101c).f8682a).cancelRequest(this.f10100b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f10101c).currentAccount).cancelRequest(this.f10100b, true);
                return;
            case 2:
                ((mm) this.f10101c).f49896a.getConnectionsManager().cancelRequest(this.f10100b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f10101c;
                rnVar.O0 = false;
                rnVar.f51666b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f10100b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f10101c).D3.getConnectionsManager().cancelRequest(this.f10100b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((qx) ((nx) this.f10101c).f37869c.f2782b).G.f39345d1).cancelRequest(this.f10100b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((f40) this.f10101c).f47454o1.f23218a).cancelRequest(this.f10100b, true);
                return;
            case 7:
                ((qa0) this.f10101c).getConnectionsManager().cancelRequest(this.f10100b, true);
                return;
            default:
                ConnectionsManager.getInstance(((a81) this.f10101c).currentAccount).cancelRequest(this.f10100b, true);
                return;
        }
    }
}
