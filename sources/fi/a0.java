package fi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.fc;
public final class a0 implements Runnable {
    public final int f11707a;
    public final a2 f11708b;

    public a0(a2 a2Var, int i7) {
        this.f11707a = i7;
        this.f11708b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f11707a) {
            case 0:
                a2 a2Var = this.f11708b;
                if (a2Var.P != null && !a2Var.V) {
                    org.telegram.messenger.g0.r(a2Var.W);
                    a2Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = a2Var.P;
                    ConnectionsManager.getInstance(a2Var.O).sendRequestTyped(getgroupcallstars, new d3.b(1), new bi.r6(7, a2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                a2 a2Var2 = this.f11708b;
                org.telegram.messenger.g0.r(a2Var2.f12568e0);
                fc fcVar = a2Var2.f12561a0;
                if (fcVar != null) {
                    fcVar.b();
                    a2Var2.f12561a0 = null;
                }
                long j3 = a2Var2.S;
                if (j3 > 0) {
                    a2Var2.S = 0L;
                    a2Var2.T = true;
                    a2Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    return;
                }
                a2Var2.j();
                return;
            default:
                a2 a2Var3 = this.f11708b;
                a2Var3.f12567e.O(true);
                a2Var3.f12573n.O(true);
                return;
        }
    }
}
