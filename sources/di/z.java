package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.sx;
import org.telegram.ui.a81;
import org.telegram.ui.f40;
import org.telegram.ui.mm;
import org.telegram.ui.qa0;
import org.telegram.ui.rn;
public final class z implements DialogInterface.OnCancelListener {
    public final int f10123a;
    public final int f10124b;
    public final Object f10125c;

    public z(Object obj, int i7, int i10) {
        this.f10123a = i10;
        this.f10125c = obj;
        this.f10124b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10123a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f10125c).f8719a).cancelRequest(this.f10124b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f10125c).currentAccount).cancelRequest(this.f10124b, true);
                return;
            case 2:
                ((mm) this.f10125c).f49941a.getConnectionsManager().cancelRequest(this.f10124b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f10125c;
                rnVar.O0 = false;
                rnVar.f51645b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f10124b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f10125c).F3.getConnectionsManager().cancelRequest(this.f10124b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((sx) ((px) this.f10125c).f38672c.f2801b).G.f40091d1).cancelRequest(this.f10124b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((f40) this.f10125c).f47526o1.f23202a).cancelRequest(this.f10124b, true);
                return;
            case 7:
                ((qa0) this.f10125c).getConnectionsManager().cancelRequest(this.f10124b, true);
                return;
            default:
                ConnectionsManager.getInstance(((a81) this.f10125c).currentAccount).cancelRequest(this.f10124b, true);
                return;
        }
    }
}
