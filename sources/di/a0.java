package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.bc;
public final class a0 implements Runnable {
    public final int f8798a;
    public final g2 f8799b;

    public a0(g2 g2Var, int i7) {
        this.f8798a = i7;
        this.f8799b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f8798a) {
            case 0:
                g2 g2Var = this.f8799b;
                if (g2Var.O != null && !g2Var.U) {
                    org.telegram.messenger.g0.r(g2Var.V);
                    g2Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = g2Var.O;
                    ConnectionsManager.getInstance(g2Var.N).sendRequestTyped(getgroupcallstars, new d3.b(1), new bi.p5(4, g2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                g2 g2Var2 = this.f8799b;
                org.telegram.messenger.g0.r(g2Var2.f9812d0);
                bc bcVar = g2Var2.W;
                if (bcVar != null) {
                    bcVar.b();
                    g2Var2.W = null;
                }
                long j3 = g2Var2.R;
                if (j3 > 0) {
                    g2Var2.R = 0L;
                    g2Var2.S = true;
                    g2Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    return;
                }
                g2Var2.j();
                return;
            default:
                g2 g2Var3 = this.f8799b;
                g2Var3.f9813e.O(true);
                g2Var3.f9818n.O(true);
                return;
        }
    }
}
