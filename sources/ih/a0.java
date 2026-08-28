package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.gc;
public final class a0 implements Runnable {
    public final int f11209a;
    public final h2 f11210b;

    public a0(h2 h2Var, int i9) {
        this.f11209a = i9;
        this.f11210b = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f11209a) {
            case 0:
                h2 h2Var = this.f11210b;
                if (h2Var.K != null && !h2Var.Q) {
                    AndroidUtilities.cancelRunOnUIThread(h2Var.R);
                    h2Var.Q = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = h2Var.K;
                    ConnectionsManager.getInstance(h2Var.J).sendRequestTyped(getgroupcallstars, new Object(), new bg.y0(6, h2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                h2 h2Var2 = this.f11210b;
                AndroidUtilities.cancelRunOnUIThread(h2Var2.W);
                gc gcVar = h2Var2.S;
                if (gcVar != null) {
                    gcVar.b();
                    h2Var2.S = null;
                }
                long j10 = h2Var2.N;
                if (j10 > 0) {
                    h2Var2.N = 0L;
                    h2Var2.O = true;
                    h2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                h2Var2.j();
                return;
            default:
                h2 h2Var3 = this.f11210b;
                h2Var3.f12278e.N(true);
                h2Var3.f12280n.N(true);
                return;
        }
    }
}
