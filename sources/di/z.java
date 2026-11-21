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
    public final int f10120a;
    public final int f10121b;
    public final Object f10122c;

    public z(Object obj, int i7, int i10) {
        this.f10120a = i10;
        this.f10122c = obj;
        this.f10121b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10120a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f10122c).f8716a).cancelRequest(this.f10121b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f10122c).currentAccount).cancelRequest(this.f10121b, true);
                return;
            case 2:
                ((mm) this.f10122c).f49937a.getConnectionsManager().cancelRequest(this.f10121b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f10122c;
                rnVar.O0 = false;
                rnVar.f51641b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f10121b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f10122c).F3.getConnectionsManager().cancelRequest(this.f10121b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((sx) ((px) this.f10122c).f38674c.f2794b).G.f40099d1).cancelRequest(this.f10121b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((f40) this.f10122c).f47522o1.f23246a).cancelRequest(this.f10121b, true);
                return;
            case 7:
                ((qa0) this.f10122c).getConnectionsManager().cancelRequest(this.f10121b, true);
                return;
            default:
                ConnectionsManager.getInstance(((a81) this.f10122c).currentAccount).cancelRequest(this.f10121b, true);
                return;
        }
    }
}
