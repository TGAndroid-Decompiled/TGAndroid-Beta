package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ic;
public final class z implements Runnable {
    public final int f16083a;
    public final g2 f16084b;

    public z(g2 g2Var, int i10) {
        this.f16083a = i10;
        this.f16084b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f16083a) {
            case 0:
                g2 g2Var = this.f16084b;
                if (g2Var.L != null && !g2Var.R) {
                    AndroidUtilities.cancelRunOnUIThread(g2Var.S);
                    g2Var.R = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = g2Var.L;
                    ConnectionsManager.getInstance(g2Var.K).sendRequestTyped(getgroupcallstars, new Object(), new dh.v(7, g2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                g2 g2Var2 = this.f16084b;
                AndroidUtilities.cancelRunOnUIThread(g2Var2.f15950a0);
                ic icVar = g2Var2.T;
                if (icVar != null) {
                    icVar.b();
                    g2Var2.T = null;
                }
                long j10 = g2Var2.O;
                if (j10 > 0) {
                    g2Var2.O = 0L;
                    g2Var2.P = true;
                    g2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                g2Var2.j();
                return;
            default:
                g2 g2Var3 = this.f16084b;
                g2Var3.e.N(true);
                g2Var3.f15957n.N(true);
                return;
        }
    }
}
