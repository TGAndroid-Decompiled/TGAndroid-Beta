package lh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fy;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ad0;
import org.telegram.ui.c60;
import org.telegram.ui.hd1;
import org.telegram.ui.jn;
import org.telegram.ui.po;
public final class w implements DialogInterface.OnCancelListener {
    public final int f13266a;
    public final int f13267b;
    public final Object f13268c;

    public w(Object obj, int i10, int i11) {
        this.f13266a = i11;
        this.f13268c = obj;
        this.f13267b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f13266a) {
            case 0:
                ConnectionsManager.getInstance(((b0) this.f13268c).f12131a).cancelRequest(this.f13267b, true);
                return;
            case 1:
                org.telegram.ui.pa.V((org.telegram.ui.pa) this.f13268c, this.f13267b);
                return;
            case 2:
                ((jn) this.f13268c).f35381a.getConnectionsManager().cancelRequest(this.f13267b, true);
                return;
            case 3:
                po poVar = (po) this.f13268c;
                poVar.K0 = false;
                poVar.f37382b = null;
                poVar.getConnectionsManager().cancelRequest(this.f13267b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f13268c).L2.getConnectionsManager().cancelRequest(this.f13267b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((fy) this.f13268c).f24981c.f25256a.C.Z0).cancelRequest(this.f13267b, true);
                return;
            case 6:
                ((c60) this.f13268c).d.getConnectionsManager().cancelRequest(this.f13267b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f13268c).currentAccount).cancelRequest(this.f13267b, true);
                return;
            case 8:
                ((ad0) this.f13268c).getConnectionsManager().cancelRequest(this.f13267b, true);
                return;
            default:
                hd1.U((hd1) this.f13268c, this.f13267b);
                return;
        }
    }
}
