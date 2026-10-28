package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.my;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ad1;
import org.telegram.ui.hn;
import org.telegram.ui.oo;
import org.telegram.ui.rc0;
import org.telegram.ui.x50;
public final class f0 implements DialogInterface.OnCancelListener {
    public final int f4590a;
    public final int f4591b;
    public final Object f4592c;

    public f0(Object obj, int i10, int i11) {
        this.f4590a = i11;
        this.f4592c = obj;
        this.f4591b = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4590a) {
            case 0:
                ConnectionsManager.getInstance(((m0) this.f4592c).f5062a).cancelRequest(this.f4591b, true);
                return;
            case 1:
                org.telegram.ui.ta.W((org.telegram.ui.ta) this.f4592c, this.f4591b);
                return;
            case 2:
                ((hn) this.f4592c).f39938a.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 3:
                oo ooVar = (oo) this.f4592c;
                ooVar.M0 = false;
                ooVar.f42131b = null;
                ooVar.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f4592c).P2.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((my) this.f4592c).f30674c.f31095a.F.f32713c1).cancelRequest(this.f4591b, true);
                return;
            case 6:
                ((x50) this.f4592c).d.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f4592c).currentAccount).cancelRequest(this.f4591b, true);
                return;
            case 8:
                ((rc0) this.f4592c).getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            default:
                ConnectionsManager.getInstance(((ad1) this.f4592c).currentAccount).cancelRequest(this.f4591b, true);
                return;
        }
    }
}
