package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.mc;
public final class y implements Runnable {
    public final int f16408a;
    public final f2 f16409b;

    public y(f2 f2Var, int i10) {
        this.f16408a = i10;
        this.f16409b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f16408a) {
            case 0:
                f2 f2Var = this.f16409b;
                if (f2Var.K != null && !f2Var.Q) {
                    AndroidUtilities.cancelRunOnUIThread(f2Var.R);
                    f2Var.Q = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = f2Var.K;
                    ConnectionsManager.getInstance(f2Var.J).sendRequestTyped(getgroupcallstars, new Object(), new bh.v(7, f2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                f2 f2Var2 = this.f16409b;
                AndroidUtilities.cancelRunOnUIThread(f2Var2.W);
                mc mcVar = f2Var2.S;
                if (mcVar != null) {
                    mcVar.b();
                    f2Var2.S = null;
                }
                long j10 = f2Var2.N;
                if (j10 > 0) {
                    f2Var2.N = 0L;
                    f2Var2.O = true;
                    f2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                f2Var2.j();
                return;
            default:
                f2 f2Var3 = this.f16409b;
                f2Var3.f16281e.N(true);
                f2Var3.f16283n.N(true);
                return;
        }
    }
}
