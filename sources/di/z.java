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
    public final int f9814a;
    public final int f9815b;
    public final Object f9816c;

    public z(Object obj, int i7, int i10) {
        this.f9814a = i10;
        this.f9816c = obj;
        this.f9815b = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9814a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.f9816c).f8434a).cancelRequest(this.f9815b, true);
                return;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.f9816c).currentAccount).cancelRequest(this.f9815b, true);
                return;
            case 2:
                ((lm) this.f9816c).f49005a.getConnectionsManager().cancelRequest(this.f9815b, true);
                return;
            case 3:
                qn qnVar = (qn) this.f9816c;
                qnVar.O0 = false;
                qnVar.f50663b = null;
                qnVar.getConnectionsManager().cancelRequest(this.f9815b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f9816c).f32319x3.getConnectionsManager().cancelRequest(this.f9815b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((lx) ((ix) this.f9816c).f35759c.f2787b).G.f36941d1).cancelRequest(this.f9815b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((c40) this.f9816c).f45951o1.f22778a).cancelRequest(this.f9815b, true);
                return;
            case 7:
                ((pa0) this.f9816c).getConnectionsManager().cancelRequest(this.f9815b, true);
                return;
            default:
                ConnectionsManager.getInstance(((w71) this.f9816c).currentAccount).cancelRequest(this.f9815b, true);
                return;
        }
    }
}
