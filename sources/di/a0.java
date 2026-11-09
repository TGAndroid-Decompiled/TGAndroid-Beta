package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.cc;
public final class a0 implements Runnable {
    public final int f8793a;
    public final g2 f8794b;

    public a0(g2 g2Var, int i7) {
        this.f8793a = i7;
        this.f8794b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f8793a) {
            case 0:
                g2 g2Var = this.f8794b;
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
                g2 g2Var2 = this.f8794b;
                org.telegram.messenger.g0.r(g2Var2.f9807d0);
                cc ccVar = g2Var2.W;
                if (ccVar != null) {
                    ccVar.b();
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
                g2 g2Var3 = this.f8794b;
                g2Var3.f9808e.O(true);
                g2Var3.f9813n.O(true);
                return;
        }
    }
}
