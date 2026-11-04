package ei;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ac;
public final class c0 implements Runnable {
    public final int f10141a;
    public final k2 f10142b;

    public c0(k2 k2Var, int i3) {
        this.f10141a = i3;
        this.f10142b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f10141a) {
            case 0:
                k2 k2Var = this.f10142b;
                if (k2Var.P != null && !k2Var.V) {
                    org.telegram.messenger.g0.r(k2Var.W);
                    k2Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = k2Var.P;
                    ConnectionsManager.getInstance(k2Var.O).sendRequestTyped(getgroupcallstars, new c3.b(1), new ai.q4(5, k2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                k2 k2Var2 = this.f10142b;
                org.telegram.messenger.g0.r(k2Var2.f11154e0);
                ac acVar = k2Var2.f11147a0;
                if (acVar != null) {
                    acVar.b();
                    k2Var2.f11147a0 = null;
                }
                long j10 = k2Var2.S;
                if (j10 > 0) {
                    k2Var2.S = 0L;
                    k2Var2.T = true;
                    k2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                k2Var2.j();
                return;
            default:
                k2 k2Var3 = this.f10142b;
                k2Var3.f11153e.O(true);
                k2Var3.f11159n.O(true);
                return;
        }
    }
}
