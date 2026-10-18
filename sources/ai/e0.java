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
    public final int f1193a;
    public final int f1194b;
    public final Object f1195c;

    public e0(Object obj, int i10, int i11) {
        this.f1193a = i11;
        this.f1195c = obj;
        this.f1194b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1193a) {
            case 0:
                ConnectionsManager.getInstance(((k0) this.f1195c).f1614a).cancelRequest(this.f1194b, true);
                return;
            case 1:
                org.telegram.ui.ua.V((org.telegram.ui.ua) this.f1195c, this.f1194b);
                return;
            case 2:
                ((en) this.f1195c).f36557a.getConnectionsManager().cancelRequest(this.f1194b, true);
                return;
            case 3:
                ko koVar = (ko) this.f1195c;
                koVar.N0 = false;
                koVar.f38548b = null;
                koVar.getConnectionsManager().cancelRequest(this.f1194b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f1195c).P2.getConnectionsManager().cancelRequest(this.f1194b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((ny) this.f1195c).f28840c.f29078a.F.f30747c1).cancelRequest(this.f1194b, true);
                return;
            case 6:
                ((s50) this.f1195c).d.getConnectionsManager().cancelRequest(this.f1194b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f1195c).currentAccount).cancelRequest(this.f1194b, true);
                return;
            case 8:
                ((pc0) this.f1195c).getConnectionsManager().cancelRequest(this.f1194b, true);
                return;
            default:
                ConnectionsManager.getInstance(((qc1) this.f1195c).currentAccount).cancelRequest(this.f1194b, true);
                return;
        }
    }
}
