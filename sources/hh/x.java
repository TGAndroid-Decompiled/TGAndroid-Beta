package hh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.sx;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.dn;
import org.telegram.ui.jo;
import org.telegram.ui.s50;
import org.telegram.ui.tc0;
import org.telegram.ui.tc1;

public final class x implements DialogInterface.OnCancelListener {

    public final int f10312a;

    public final int f10313b;

    public final Object f10314c;

    public x(Object obj, int i10, int i11) {
        this.f10312a = i11;
        this.f10314c = obj;
        this.f10313b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10312a) {
            case 0:
                ConnectionsManager.getInstance(((c0) this.f10314c).f9049a).cancelRequest(this.f10313b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.na) this.f10314c).currentAccount).cancelRequest(this.f10313b, true);
                break;
            case 2:
                ((dn) this.f10314c).f37446a.getConnectionsManager().cancelRequest(this.f10313b, true);
                break;
            case 3:
                jo joVar = (jo) this.f10314c;
                joVar.J0 = false;
                joVar.f39405b = null;
                joVar.getConnectionsManager().cancelRequest(this.f10313b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.f10314c).K2.getConnectionsManager().cancelRequest(this.f10313b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((sx) this.f10314c).f32597c.f32904a.B.Y0).cancelRequest(this.f10313b, true);
                break;
            case 6:
                ((s50) this.f10314c).d.getConnectionsManager().cancelRequest(this.f10313b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f10314c).currentAccount).cancelRequest(this.f10313b, true);
                break;
            case 8:
                ((tc0) this.f10314c).getConnectionsManager().cancelRequest(this.f10313b, true);
                break;
            default:
                ConnectionsManager.getInstance(((tc1) this.f10314c).currentAccount).cancelRequest(this.f10313b, true);
                break;
        }
    }
}
