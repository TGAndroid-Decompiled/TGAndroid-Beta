package fi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.xb;
public final class a0 implements Runnable {
    public final int f11396a;
    public final c2 f11397b;

    public a0(c2 c2Var, int i7) {
        this.f11396a = i7;
        this.f11397b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f11396a) {
            case 0:
                c2 c2Var = this.f11397b;
                if (c2Var.P != null && !c2Var.V) {
                    org.telegram.messenger.g0.r(c2Var.W);
                    c2Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = c2Var.P;
                    ConnectionsManager.getInstance(c2Var.O).sendRequestTyped(getgroupcallstars, new d3.b(1), new bi.e4(5, c2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                c2 c2Var2 = this.f11397b;
                org.telegram.messenger.g0.r(c2Var2.f12383e0);
                xb xbVar = c2Var2.f12376a0;
                if (xbVar != null) {
                    xbVar.b();
                    c2Var2.f12376a0 = null;
                }
                long j3 = c2Var2.S;
                if (j3 > 0) {
                    c2Var2.S = 0L;
                    c2Var2.T = true;
                    c2Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    return;
                }
                c2Var2.j();
                return;
            default:
                c2 c2Var3 = this.f11397b;
                c2Var3.f12382e.O(true);
                c2Var3.f12388n.O(true);
                return;
        }
    }
}
