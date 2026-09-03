package mh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hy;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.bd0;
import org.telegram.ui.d60;
import org.telegram.ui.jn;
import org.telegram.ui.od1;
import org.telegram.ui.po;
public final class v implements DialogInterface.OnCancelListener {
    public final int f14912a;
    public final int f14913b;
    public final Object f14914c;

    public v(Object obj, int i10, int i11) {
        this.f14912a = i11;
        this.f14914c = obj;
        this.f14913b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14912a) {
            case 0:
                ConnectionsManager.getInstance(((a0) this.f14914c).f13669a).cancelRequest(this.f14913b, true);
                return;
            case 1:
                org.telegram.ui.pa.V((org.telegram.ui.pa) this.f14914c, this.f14913b);
                return;
            case 2:
                ((jn) this.f14914c).f38085a.getConnectionsManager().cancelRequest(this.f14913b, true);
                return;
            case 3:
                po poVar = (po) this.f14914c;
                poVar.K0 = false;
                poVar.f40058b = null;
                poVar.getConnectionsManager().cancelRequest(this.f14913b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f14914c).L2.getConnectionsManager().cancelRequest(this.f14913b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((hy) this.f14914c).f27648c.f27909a.C.Z0).cancelRequest(this.f14913b, true);
                return;
            case 6:
                ((d60) this.f14914c).d.getConnectionsManager().cancelRequest(this.f14913b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f14914c).currentAccount).cancelRequest(this.f14913b, true);
                return;
            case 8:
                ((bd0) this.f14914c).getConnectionsManager().cancelRequest(this.f14913b, true);
                return;
            default:
                od1.U((od1) this.f14914c, this.f14913b);
                return;
        }
    }
}
