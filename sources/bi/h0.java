package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.sc;
public final class h0 implements Runnable {
    public final int f3109a;
    public final h3 f3110b;

    public h0(h3 h3Var, int i10) {
        this.f3109a = i10;
        this.f3110b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f3109a) {
            case 0:
                h3 h3Var = this.f3110b;
                if (h3Var.O != null && !h3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(h3Var.V);
                    h3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = h3Var.O;
                    ConnectionsManager.getInstance(h3Var.N).sendRequestTyped(getgroupcallstars, new Object(), new f0(0, h3Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f3110b;
                AndroidUtilities.cancelRunOnUIThread(h3Var2.f3060d0);
                sc scVar = h3Var2.W;
                if (scVar != null) {
                    scVar.b();
                    h3Var2.W = null;
                }
                long j10 = h3Var2.R;
                if (j10 > 0) {
                    h3Var2.R = 0L;
                    h3Var2.S = true;
                    h3Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                h3Var2.j();
                return;
            default:
                h3 h3Var3 = this.f3110b;
                h3Var3.e.N(true);
                h3Var3.f3065n.N(true);
                return;
        }
    }
}
