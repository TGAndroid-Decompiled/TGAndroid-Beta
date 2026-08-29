package jh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.zx;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.fn;
import org.telegram.ui.ko;
import org.telegram.ui.r50;
import org.telegram.ui.rc0;
import org.telegram.ui.vc1;
public final class w implements DialogInterface.OnCancelListener {
    public final int f12999a;
    public final int f13000b;
    public final Object f13001c;

    public w(Object obj, int i10, int i11) {
        this.f12999a = i11;
        this.f13001c = obj;
        this.f13000b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f12999a) {
            case 0:
                ConnectionsManager.getInstance(((b0) this.f13001c).f11774a).cancelRequest(this.f13000b, true);
                return;
            case 1:
                org.telegram.ui.la.V((org.telegram.ui.la) this.f13001c, this.f13000b);
                return;
            case 2:
                ((fn) this.f13001c).f38212a.getConnectionsManager().cancelRequest(this.f13000b, true);
                return;
            case 3:
                ko koVar = (ko) this.f13001c;
                koVar.J0 = false;
                koVar.f39940b = null;
                koVar.getConnectionsManager().cancelRequest(this.f13000b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f13001c).K2.getConnectionsManager().cancelRequest(this.f13000b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((zx) this.f13001c).f35442c.f26911a.B.Y0).cancelRequest(this.f13000b, true);
                return;
            case 6:
                ((r50) this.f13001c).d.getConnectionsManager().cancelRequest(this.f13000b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f13001c).currentAccount).cancelRequest(this.f13000b, true);
                return;
            case 8:
                ((rc0) this.f13001c).getConnectionsManager().cancelRequest(this.f13000b, true);
                return;
            default:
                vc1.U((vc1) this.f13001c, this.f13000b);
                return;
        }
    }
}
