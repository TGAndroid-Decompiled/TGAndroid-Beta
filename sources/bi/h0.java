package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.qc;
public final class h0 implements Runnable {
    public final int f3072a;
    public final e3 f3073b;

    public h0(e3 e3Var, int i10) {
        this.f3072a = i10;
        this.f3073b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f3072a) {
            case 0:
                e3 e3Var = this.f3073b;
                if (e3Var.O != null && !e3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(e3Var.V);
                    e3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = e3Var.O;
                    ConnectionsManager.getInstance(e3Var.N).sendRequestTyped(getgroupcallstars, new Object(), new f0(0, e3Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                e3 e3Var2 = this.f3073b;
                AndroidUtilities.cancelRunOnUIThread(e3Var2.f3033d0);
                qc qcVar = e3Var2.W;
                if (qcVar != null) {
                    qcVar.b();
                    e3Var2.W = null;
                }
                long j3 = e3Var2.R;
                if (j3 > 0) {
                    e3Var2.R = 0L;
                    e3Var2.S = true;
                    e3Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    return;
                }
                e3Var2.j();
                return;
            default:
                e3 e3Var3 = this.f3073b;
                e3Var3.f3034e.N(true);
                e3Var3.f3039n.N(true);
                return;
        }
    }
}
