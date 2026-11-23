package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.sx;
import org.telegram.ui.a81;
import org.telegram.ui.f40;
import org.telegram.ui.mm;
import org.telegram.ui.qa0;
import org.telegram.ui.rn;
public final class z implements DialogInterface.OnCancelListener {
    public final int f10086a;
    public final int f10087b;
    public final Object f10088c;

    public z(Object obj, int i7, int i10) {
        this.f10086a = i10;
        this.f10088c = obj;
        this.f10087b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10086a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f10088c).f8682a).cancelRequest(this.f10087b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f10088c).currentAccount).cancelRequest(this.f10087b, true);
                return;
            case 2:
                ((mm) this.f10088c).f49910a.getConnectionsManager().cancelRequest(this.f10087b, true);
                return;
            case 3:
                rn rnVar = (rn) this.f10088c;
                rnVar.O0 = false;
                rnVar.f51677b = null;
                rnVar.getConnectionsManager().cancelRequest(this.f10087b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f10088c).F3.getConnectionsManager().cancelRequest(this.f10087b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((sx) ((px) this.f10088c).f38626c.f2752b).G.f40074d1).cancelRequest(this.f10087b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((f40) this.f10088c).f47488o1.f23166a).cancelRequest(this.f10087b, true);
                return;
            case 7:
                ((qa0) this.f10088c).getConnectionsManager().cancelRequest(this.f10087b, true);
                return;
            default:
                ConnectionsManager.getInstance(((a81) this.f10088c).currentAccount).cancelRequest(this.f10087b, true);
                return;
        }
    }
}
