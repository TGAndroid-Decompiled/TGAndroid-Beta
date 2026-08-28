package gh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.rx;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ho;
import org.telegram.ui.o50;
import org.telegram.ui.pc0;
import org.telegram.ui.tc1;
public final class x implements DialogInterface.OnCancelListener {
    public final int f9125a;
    public final int f9126b;
    public final Object f9127c;

    public x(Object obj, int i9, int i10) {
        this.f9125a = i10;
        this.f9127c = obj;
        this.f9126b = i9;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9125a) {
            case 0:
                ConnectionsManager.getInstance(((c0) this.f9127c).f7894a).cancelRequest(this.f9126b, true);
                return;
            case 1:
                org.telegram.ui.ma.U((org.telegram.ui.ma) this.f9127c, this.f9126b);
                return;
            case 2:
                ((cn) this.f9127c).f37236a.getConnectionsManager().cancelRequest(this.f9126b, true);
                return;
            case 3:
                ho hoVar = (ho) this.f9127c;
                hoVar.J0 = false;
                hoVar.f38837b = null;
                hoVar.getConnectionsManager().cancelRequest(this.f9126b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f9127c).K2.getConnectionsManager().cancelRequest(this.f9126b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((rx) this.f9127c).f32299c.f32564a.B.Y0).cancelRequest(this.f9126b, true);
                return;
            case 6:
                ((o50) this.f9127c).d.getConnectionsManager().cancelRequest(this.f9126b, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.f9127c).currentAccount).cancelRequest(this.f9126b, true);
                return;
            case 8:
                ((pc0) this.f9127c).getConnectionsManager().cancelRequest(this.f9126b, true);
                return;
            default:
                tc1.T((tc1) this.f9127c, this.f9126b);
                return;
        }
    }
}
