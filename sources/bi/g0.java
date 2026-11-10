package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.gx;
import org.telegram.ui.a81;
import org.telegram.ui.f40;
import org.telegram.ui.nm;
import org.telegram.ui.rn;
import org.telegram.ui.sa0;
public final class g0 implements DialogInterface.OnCancelListener {
    public final int f3907a;
    public final int f3908b;
    public final Object f3909c;

    public g0(Object obj, int i7, int i10) {
        this.f3907a = i10;
        this.f3909c = obj;
        this.f3908b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f3907a) {
            case 0:
                ConnectionsManager.getInstance(((n0) this.f3909c).f4384a).cancelRequest(this.f3908b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f3909c).currentAccount).cancelRequest(this.f3908b, true);
                return;
            case 2:
                ((nm) this.f3909c).f48227a.getConnectionsManager().cancelRequest(this.f3908b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f3909c;
                rnVar.N0 = false;
                rnVar.f49449b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f3908b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f3909c).P2.getConnectionsManager().cancelRequest(this.f3908b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((gx) ((cx) this.f3909c).f32777c.f2833b).F.f34016c1).cancelRequest(this.f3908b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((f40) this.f3909c).n1.f21770a).cancelRequest(this.f3908b, true);
                return;
            case 7:
                ((sa0) this.f3909c).getConnectionsManager().cancelRequest(this.f3908b, true);
                return;
            default:
                a81.Z((a81) this.f3909c, this.f3908b);
                return;
        }
    }
}
