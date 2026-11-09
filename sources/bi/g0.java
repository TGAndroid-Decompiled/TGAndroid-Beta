package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.hx;
import org.telegram.ui.e40;
import org.telegram.ui.nm;
import org.telegram.ui.ra0;
import org.telegram.ui.rn;
import org.telegram.ui.z71;
public final class g0 implements DialogInterface.OnCancelListener {
    public final int f3910a;
    public final int f3911b;
    public final Object f3912c;

    public g0(Object obj, int i7, int i10) {
        this.f3910a = i10;
        this.f3912c = obj;
        this.f3911b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f3910a) {
            case 0:
                ConnectionsManager.getInstance(((n0) this.f3912c).f4384a).cancelRequest(this.f3911b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f3912c).currentAccount).cancelRequest(this.f3911b, true);
                return;
            case 2:
                ((nm) this.f3912c).f48207a.getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f3912c;
                rnVar.N0 = false;
                rnVar.f49511b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f3912c).P2.getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((hx) ((dx) this.f3912c).f33180c.f2833b).F.f34415c1).cancelRequest(this.f3911b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((e40) this.f3912c).f45228k1.f21765a).cancelRequest(this.f3911b, true);
                return;
            case 7:
                ((ra0) this.f3912c).getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            default:
                z71.Z((z71) this.f3912c, this.f3911b);
                return;
        }
    }
}
