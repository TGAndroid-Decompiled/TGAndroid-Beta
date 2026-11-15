package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.lx;
import org.telegram.ui.c40;
import org.telegram.ui.lm;
import org.telegram.ui.pa0;
import org.telegram.ui.qn;
import org.telegram.ui.w71;
public final class z implements DialogInterface.OnCancelListener {
    public final int f9812a;
    public final int f9813b;
    public final Object f9814c;

    public z(Object obj, int i7, int i10) {
        this.f9812a = i10;
        this.f9814c = obj;
        this.f9813b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9812a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f9814c).f8430a).cancelRequest(this.f9813b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f9814c).currentAccount).cancelRequest(this.f9813b, true);
                return;
            case 2:
                ((lm) this.f9814c).f49001a.getConnectionsManager().cancelRequest(this.f9813b, true);
                return;
            case 3:
                qn qnVar = (qn) this.f9814c;
                qnVar.O0 = false;
                qnVar.f50662b = null;
                qnVar.getConnectionsManager().cancelRequest(this.f9813b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f9814c).f32319x3.getConnectionsManager().cancelRequest(this.f9813b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((lx) ((ix) this.f9814c).f35746c.f2790b).G.f36941d1).cancelRequest(this.f9813b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((c40) this.f9814c).f45940o1.f22782a).cancelRequest(this.f9813b, true);
                return;
            case 7:
                ((pa0) this.f9814c).getConnectionsManager().cancelRequest(this.f9813b, true);
                return;
            default:
                ConnectionsManager.getInstance(((w71) this.f9814c).currentAccount).cancelRequest(this.f9813b, true);
                return;
        }
    }
}
