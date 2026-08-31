package mh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hy;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.bd0;
import org.telegram.ui.d60;
import org.telegram.ui.jd1;
import org.telegram.ui.jn;
import org.telegram.ui.po;
public final class v implements DialogInterface.OnCancelListener {
    public final int f14910a;
    public final int f14911b;
    public final Object f14912c;

    public v(Object obj, int i10, int i11) {
        this.f14910a = i11;
        this.f14912c = obj;
        this.f14911b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14910a) {
            case 0:
                ConnectionsManager.getInstance(((a0) this.f14912c).f13667a).cancelRequest(this.f14911b, true);
                return;
            case 1:
                org.telegram.ui.pa.V((org.telegram.ui.pa) this.f14912c, this.f14911b);
                return;
            case 2:
                ((jn) this.f14912c).f38188a.getConnectionsManager().cancelRequest(this.f14911b, true);
                return;
            case 3:
                po poVar = (po) this.f14912c;
                poVar.K0 = false;
                poVar.f40096b = null;
                poVar.getConnectionsManager().cancelRequest(this.f14911b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f14912c).L2.getConnectionsManager().cancelRequest(this.f14911b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((hy) this.f14912c).f27600c.f27920a.C.Z0).cancelRequest(this.f14911b, true);
                return;
            case 6:
                ((d60) this.f14912c).d.getConnectionsManager().cancelRequest(this.f14911b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f14912c).currentAccount).cancelRequest(this.f14911b, true);
                return;
            case 8:
                ((bd0) this.f14912c).getConnectionsManager().cancelRequest(this.f14911b, true);
                return;
            default:
                jd1.U((jd1) this.f14912c, this.f14911b);
                return;
        }
    }
}
