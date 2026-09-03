package lh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fy;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.e60;
import org.telegram.ui.ln;
import org.telegram.ui.od1;
import org.telegram.ui.ro;
public final class w implements DialogInterface.OnCancelListener {
    public final int f13250a;
    public final int f13251b;
    public final Object f13252c;

    public w(Object obj, int i10, int i11) {
        this.f13250a = i11;
        this.f13252c = obj;
        this.f13251b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f13250a) {
            case 0:
                ConnectionsManager.getInstance(((b0) this.f13252c).f12115a).cancelRequest(this.f13251b, true);
                return;
            case 1:
                org.telegram.ui.ra.V((org.telegram.ui.ra) this.f13252c, this.f13251b);
                return;
            case 2:
                ((ln) this.f13252c).f35808a.getConnectionsManager().cancelRequest(this.f13251b, true);
                return;
            case 3:
                ro roVar = (ro) this.f13252c;
                roVar.K0 = false;
                roVar.f37902b = null;
                roVar.getConnectionsManager().cancelRequest(this.f13251b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f13252c).L2.getConnectionsManager().cancelRequest(this.f13251b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((fy) this.f13252c).f24987c.f25252a.C.Z0).cancelRequest(this.f13251b, true);
                return;
            case 6:
                ((e60) this.f13252c).d.getConnectionsManager().cancelRequest(this.f13251b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f13252c).currentAccount).cancelRequest(this.f13251b, true);
                return;
            case 8:
                ((cd0) this.f13252c).getConnectionsManager().cancelRequest(this.f13251b, true);
                return;
            default:
                od1.U((od1) this.f13252c, this.f13251b);
                return;
        }
    }
}
