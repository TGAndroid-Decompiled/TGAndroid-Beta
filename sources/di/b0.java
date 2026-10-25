package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.qc;
public final class b0 implements Runnable {
    public final int f8412a;
    public final m2 f8413b;

    public b0(m2 m2Var, int i10) {
        this.f8412a = i10;
        this.f8413b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f8412a) {
            case 0:
                m2 m2Var = this.f8413b;
                if (m2Var.O != null && !m2Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var.V);
                    m2Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = m2Var.O;
                    ConnectionsManager.getInstance(m2Var.N).sendRequestTyped(getgroupcallstars, new Object(), new bi.m5(4, m2Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                m2 m2Var2 = this.f8413b;
                AndroidUtilities.cancelRunOnUIThread(m2Var2.f9346d0);
                qc qcVar = m2Var2.W;
                if (qcVar != null) {
                    qcVar.b();
                    m2Var2.W = null;
                }
                long j10 = m2Var2.R;
                if (j10 > 0) {
                    m2Var2.R = 0L;
                    m2Var2.S = true;
                    m2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                m2Var2.j();
                return;
            default:
                m2 m2Var3 = this.f8413b;
                m2Var3.e.O(true);
                m2Var3.f9351n.O(true);
                return;
        }
    }
}
