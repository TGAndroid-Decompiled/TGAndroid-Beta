package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.ex;
import org.telegram.ui.hm;
import org.telegram.ui.la0;
import org.telegram.ui.ln;
import org.telegram.ui.o71;
import org.telegram.ui.x30;
public final class b0 implements DialogInterface.OnCancelListener {
    public final int f4851a;
    public final int f4852b;
    public final Object f4853c;

    public b0(Object obj, int i3, int i10) {
        this.f4851a = i10;
        this.f4853c = obj;
        this.f4852b = i3;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4851a) {
            case 0:
                ConnectionsManager.getInstance(((i0) this.f4853c).f5268a).cancelRequest(this.f4852b, true);
                return;
            case 1:
                org.telegram.ui.ka.a0((org.telegram.ui.ka) this.f4853c, this.f4852b);
                return;
            case 2:
                ((hm) this.f4853c).f45934a.getConnectionsManager().cancelRequest(this.f4852b, true);
                return;
            case 3:
                ln lnVar = (ln) this.f4853c;
                lnVar.O0 = false;
                lnVar.f47366b = null;
                lnVar.getConnectionsManager().cancelRequest(this.f4852b, true);
                return;
            case 4:
                ((ChatActivityEnterView) this.f4853c).Q2.getConnectionsManager().cancelRequest(this.f4852b, true);
                return;
            case 5:
                ConnectionsManager.getInstance(((ex) ((bx) this.f4853c).f32417c.f2266b).G.f33529d1).cancelRequest(this.f4852b, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((x30) this.f4853c).f51759l1.f21919a).cancelRequest(this.f4852b, true);
                return;
            case 7:
                ((la0) this.f4853c).getConnectionsManager().cancelRequest(this.f4852b, true);
                return;
            default:
                o71.Z((o71) this.f4853c, this.f4852b);
                return;
        }
    }
}
