package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.qc;
public final class b0 implements Runnable {
    public final int f5235a;
    public final n2 f5236b;

    public b0(n2 n2Var, int i10) {
        this.f5235a = i10;
        this.f5236b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f5235a) {
            case 0:
                n2 n2Var = this.f5236b;
                if (n2Var.O != null && !n2Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(n2Var.V);
                    n2Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = n2Var.O;
                    ConnectionsManager.getInstance(n2Var.N).sendRequestTyped(getgroupcallstars, new Object(), new ai.r5(4, n2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                n2 n2Var2 = this.f5236b;
                AndroidUtilities.cancelRunOnUIThread(n2Var2.f6135d0);
                qc qcVar = n2Var2.W;
                if (qcVar != null) {
                    qcVar.b();
                    n2Var2.W = null;
                }
                long j10 = n2Var2.R;
                if (j10 > 0) {
                    n2Var2.R = 0L;
                    n2Var2.S = true;
                    n2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                n2Var2.j();
                return;
            default:
                n2 n2Var3 = this.f5236b;
                n2Var3.e.N(true);
                n2Var3.f6140n.N(true);
                return;
        }
    }
}
