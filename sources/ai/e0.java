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
    public final int f1188a;
    public final int f1189b;
    public final Object f1190c;

    public e0(Object obj, int i10, int i11) {
        this.f1188a = i11;
        this.f1190c = obj;
        this.f1189b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1188a) {
            case 0:
                ConnectionsManager.getInstance(((k0) this.f1190c).f1618a).cancelRequest(this.f1189b, true);
                return;
            case 1:
                org.telegram.ui.ua.V((org.telegram.ui.ua) this.f1190c, this.f1189b);
                return;
            case 2:
                ((en) this.f1190c).f36569a.getConnectionsManager().cancelRequest(this.f1189b, true);
                return;
            case 3:
                ko koVar = (ko) this.f1190c;
                koVar.N0 = false;
                koVar.f38585b = null;
                koVar.getConnectionsManager().cancelRequest(this.f1189b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f1190c).P2.getConnectionsManager().cancelRequest(this.f1189b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((ny) this.f1190c).f28840c.f29078a.F.f30747c1).cancelRequest(this.f1189b, true);
                return;
            case 6:
                ((s50) this.f1190c).d.getConnectionsManager().cancelRequest(this.f1189b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f1190c).currentAccount).cancelRequest(this.f1189b, true);
                return;
            case 8:
                ((pc0) this.f1190c).getConnectionsManager().cancelRequest(this.f1189b, true);
                return;
            default:
                ConnectionsManager.getInstance(((qc1) this.f1190c).currentAccount).cancelRequest(this.f1189b, true);
                return;
        }
    }
}
