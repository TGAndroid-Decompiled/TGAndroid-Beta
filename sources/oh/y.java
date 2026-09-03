package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ic;
public final class y implements Runnable {
    public final int f17936a;
    public final h2 f17937b;

    public y(h2 h2Var, int i10) {
        this.f17936a = i10;
        this.f17937b = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f17936a) {
            case 0:
                h2 h2Var = this.f17937b;
                if (h2Var.L != null && !h2Var.R) {
                    AndroidUtilities.cancelRunOnUIThread(h2Var.S);
                    h2Var.R = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = h2Var.L;
                    ConnectionsManager.getInstance(h2Var.K).sendRequestTyped(getgroupcallstars, new Object(), new eh.w(7, h2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                h2 h2Var2 = this.f17937b;
                AndroidUtilities.cancelRunOnUIThread(h2Var2.f17830a0);
                ic icVar = h2Var2.T;
                if (icVar != null) {
                    icVar.b();
                    h2Var2.T = null;
                }
                long j10 = h2Var2.O;
                if (j10 > 0) {
                    h2Var2.O = 0L;
                    h2Var2.P = true;
                    h2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                h2Var2.j();
                return;
            default:
                h2 h2Var3 = this.f17937b;
                h2Var3.f17836e.N(true);
                h2Var3.f17838n.N(true);
                return;
        }
    }
}
