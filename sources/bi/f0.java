package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.my;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.fn;
import org.telegram.ui.mo;
import org.telegram.ui.pc0;
import org.telegram.ui.v50;
import org.telegram.ui.xc1;
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
                ((fn) this.f4592c).f39420a.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 3:
                mo moVar = (mo) this.f4592c;
                moVar.M0 = false;
                moVar.f41596b = null;
                moVar.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f4592c).P2.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((my) this.f4592c).f30774c.f31088a.F.f32716c1).cancelRequest(this.f4591b, true);
                return;
            case 6:
                ((v50) this.f4592c).d.getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f4592c).currentAccount).cancelRequest(this.f4591b, true);
                return;
            case 8:
                ((pc0) this.f4592c).getConnectionsManager().cancelRequest(this.f4591b, true);
                return;
            default:
                xc1.V((xc1) this.f4592c, this.f4591b);
                return;
        }
    }
}
