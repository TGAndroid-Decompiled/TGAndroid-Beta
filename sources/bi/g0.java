package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.gx;
import org.telegram.ui.c40;
import org.telegram.ui.lm;
import org.telegram.ui.pa0;
import org.telegram.ui.pn;
import org.telegram.ui.x71;
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
                org.telegram.ui.la.a0((org.telegram.ui.la) this.f3912c, this.f3911b);
                return;
            case 2:
                ((lm) this.f3912c).f47534a.getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            case 3:
                pn pnVar = (pn) this.f3912c;
                pnVar.N0 = false;
                pnVar.f48864b = null;
                pnVar.getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f3912c).P2.getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((gx) ((cx) this.f3912c).f32689c.f2833b).F.f34076c1).cancelRequest(this.f3911b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((c40) this.f3912c).f44565k1.f21723a).cancelRequest(this.f3911b, true);
                return;
            case 7:
                ((pa0) this.f3912c).getConnectionsManager().cancelRequest(this.f3911b, true);
                return;
            default:
                x71.Z((x71) this.f3912c, this.f3911b);
                return;
        }
    }
}
