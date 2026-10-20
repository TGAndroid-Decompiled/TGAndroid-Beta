package ai;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ny;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.cn;
import org.telegram.ui.io;
import org.telegram.ui.nc0;
import org.telegram.ui.oc1;
import org.telegram.ui.q50;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f1181a;
    public final int f1182b;
    public final Object f1183c;

    public e0(Object obj, int i10, int i11) {
        this.f1181a = i11;
        this.f1183c = obj;
        this.f1182b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1181a) {
            case 0:
                ConnectionsManager.getInstance(((k0) this.f1183c).f1619a).cancelRequest(this.f1182b, true);
                return;
            case 1:
                org.telegram.ui.sa.V((org.telegram.ui.sa) this.f1183c, this.f1182b);
                return;
            case 2:
                ((cn) this.f1183c).f36010a.getConnectionsManager().cancelRequest(this.f1182b, true);
                return;
            case 3:
                io ioVar = (io) this.f1183c;
                ioVar.N0 = false;
                ioVar.f38034b = null;
                ioVar.getConnectionsManager().cancelRequest(this.f1182b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f1183c).P2.getConnectionsManager().cancelRequest(this.f1182b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((ny) this.f1183c).f28897c.f29153a.F.f30722c1).cancelRequest(this.f1182b, true);
                return;
            case 6:
                ((q50) this.f1183c).d.getConnectionsManager().cancelRequest(this.f1182b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f1183c).currentAccount).cancelRequest(this.f1182b, true);
                return;
            case 8:
                ((nc0) this.f1183c).getConnectionsManager().cancelRequest(this.f1182b, true);
                return;
            default:
                ConnectionsManager.getInstance(((oc1) this.f1183c).currentAccount).cancelRequest(this.f1182b, true);
                return;
        }
    }
}
