package ai;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ny;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.en;
import org.telegram.ui.ko;
import org.telegram.ui.pc0;
import org.telegram.ui.qc1;
import org.telegram.ui.s50;
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
                ConnectionsManager.getInstance(((k0) this.f1192c).f1608a).cancelRequest(this.f1191b, true);
                return;
            case 1:
                org.telegram.ui.ua.V((org.telegram.ui.ua) this.f1192c, this.f1191b);
                return;
            case 2:
                ((en) this.f1192c).f36573a.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 3:
                ko koVar = (ko) this.f1192c;
                koVar.N0 = false;
                koVar.f38593b = null;
                koVar.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f1192c).P2.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((ny) this.f1192c).f28847c.f29085a.F.f30754c1).cancelRequest(this.f1191b, true);
                return;
            case 6:
                ((s50) this.f1192c).d.getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f1192c).currentAccount).cancelRequest(this.f1191b, true);
                return;
            case 8:
                ((pc0) this.f1192c).getConnectionsManager().cancelRequest(this.f1191b, true);
                return;
            default:
                ConnectionsManager.getInstance(((qc1) this.f1192c).currentAccount).cancelRequest(this.f1191b, true);
                return;
        }
    }
}
