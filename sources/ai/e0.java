package ai;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ly;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.dn;
import org.telegram.ui.ko;
import org.telegram.ui.rc0;
import org.telegram.ui.tc1;
import org.telegram.ui.u50;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f1174a;
    public final int f1175b;
    public final Object f1176c;

    public e0(Object obj, int i10, int i11) {
        this.f1174a = i11;
        this.f1176c = obj;
        this.f1175b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1174a) {
            case 0:
                ConnectionsManager.getInstance(((k0) this.f1176c).f1598a).cancelRequest(this.f1175b, true);
                return;
            case 1:
                org.telegram.ui.sa.V((org.telegram.ui.sa) this.f1176c, this.f1175b);
                return;
            case 2:
                ((dn) this.f1176c).f36651a.getConnectionsManager().cancelRequest(this.f1175b, true);
                return;
            case 3:
                ko koVar = (ko) this.f1176c;
                koVar.M0 = false;
                koVar.f38953b = null;
                koVar.getConnectionsManager().cancelRequest(this.f1175b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f1176c).P2.getConnectionsManager().cancelRequest(this.f1175b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((ly) this.f1176c).f28469c.f28718a.F.f30310c1).cancelRequest(this.f1175b, true);
                return;
            case 6:
                ((u50) this.f1176c).d.getConnectionsManager().cancelRequest(this.f1175b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f1176c).currentAccount).cancelRequest(this.f1175b, true);
                return;
            case 8:
                ((rc0) this.f1176c).getConnectionsManager().cancelRequest(this.f1175b, true);
                return;
            default:
                ConnectionsManager.getInstance(((tc1) this.f1176c).currentAccount).cancelRequest(this.f1175b, true);
                return;
        }
    }
}
