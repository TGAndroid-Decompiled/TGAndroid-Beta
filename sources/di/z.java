package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.px;
import org.telegram.ui.e40;
import org.telegram.ui.mm;
import org.telegram.ui.pa0;
import org.telegram.ui.rn;
import org.telegram.ui.y71;
public final class z implements DialogInterface.OnCancelListener {
    public final int f10084a;
    public final int f10085b;
    public final Object f10086c;

    public z(Object obj, int i7, int i10) {
        this.f10084a = i10;
        this.f10086c = obj;
        this.f10085b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10084a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f10086c).f8680a).cancelRequest(this.f10085b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f10086c).currentAccount).cancelRequest(this.f10085b, true);
                return;
            case 2:
                ((mm) this.f10086c).f50079a.getConnectionsManager().cancelRequest(this.f10085b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f10086c;
                rnVar.O0 = false;
                rnVar.f51766b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f10085b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f10086c).F3.getConnectionsManager().cancelRequest(this.f10085b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((px) ((mx) this.f10086c).f37564c.f2753b).G.f39047d1).cancelRequest(this.f10085b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((e40) this.f10086c).f47376o1.f23343a).cancelRequest(this.f10085b, true);
                return;
            case 7:
                ((pa0) this.f10086c).getConnectionsManager().cancelRequest(this.f10085b, true);
                return;
            default:
                ConnectionsManager.getInstance(((y71) this.f10086c).currentAccount).cancelRequest(this.f10085b, true);
                return;
        }
    }
}
