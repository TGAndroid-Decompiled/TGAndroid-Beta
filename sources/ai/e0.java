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
    public final int f1190a;
    public final int f1191b;
    public final Object f1192c;

    public e0(Object obj, int i10, int i11) {
        this.f1190a = i11;
        this.f1192c = obj;
        this.f1191b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1190a) {
            case 0:
                ConnectionsManager.getInstance(((k0) this.f1192c).f1606a).cancelRequest(this.f1191b, true);
                return;
            case 1:
                org.telegram.ui.sa.V((org.telegram.ui.sa) this.f1192c, this.f1191b);
                return;
            case 2:
                ((cn) this.f1192c).f36032a.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 3:
                io ioVar = (io) this.f1192c;
                ioVar.N0 = false;
                ioVar.f38026b = null;
                ioVar.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f1192c).P2.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((ny) this.f1192c).f28857c.f29111a.F.f30770c1).cancelRequest(this.f1191b, true);
                return;
            case 6:
                ((q50) this.f1192c).d.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f1192c).currentAccount).cancelRequest(this.f1191b, true);
                return;
            case 8:
                ((nc0) this.f1192c).getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            default:
                ConnectionsManager.getInstance(((oc1) this.f1192c).currentAccount).cancelRequest(this.f1191b, true);
                return;
        }
    }
}
