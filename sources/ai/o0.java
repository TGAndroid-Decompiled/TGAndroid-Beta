package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o0 implements Runnable {
    public final int f1321a;
    public final r3 f1322b;

    public o0(r3 r3Var, int i10) {
        this.f1321a = i10;
        this.f1322b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f1321a) {
            case 0:
                r3 r3Var = this.f1322b;
                if (r3Var.O != null && !r3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(r3Var.V);
                    r3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = r3Var.O;
                    ConnectionsManager.getInstance(r3Var.N).sendRequestTyped(getgroupcallstars, new Object(), new m0(0, r3Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                r3 r3Var2 = this.f1322b;
                AndroidUtilities.cancelRunOnUIThread(r3Var2.f1329d0);
                org.telegram.ui.Components.pc pcVar = r3Var2.W;
                if (pcVar != null) {
                    pcVar.b();
                    r3Var2.W = null;
                }
                long j3 = r3Var2.R;
                if (j3 > 0) {
                    r3Var2.R = 0L;
                    r3Var2.S = true;
                    r3Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    return;
                }
                r3Var2.j();
                return;
            default:
                r3 r3Var3 = this.f1322b;
                r3Var3.e.N(true);
                r3Var3.f1334n.N(true);
                return;
        }
    }
}
