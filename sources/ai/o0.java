package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o0 implements Runnable {
    public final int f1501a;
    public final s3 f1502b;

    public o0(s3 s3Var, int i10) {
        this.f1501a = i10;
        this.f1502b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f1501a) {
            case 0:
                s3 s3Var = this.f1502b;
                if (s3Var.O != null && !s3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(s3Var.V);
                    s3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = s3Var.O;
                    ConnectionsManager.getInstance(s3Var.N).sendRequestTyped(getgroupcallstars, new Object(), new m0(0, s3Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f1502b;
                AndroidUtilities.cancelRunOnUIThread(s3Var2.f1509d0);
                org.telegram.ui.Components.sc scVar = s3Var2.W;
                if (scVar != null) {
                    scVar.b();
                    s3Var2.W = null;
                }
                long j3 = s3Var2.R;
                if (j3 > 0) {
                    s3Var2.R = 0L;
                    s3Var2.S = true;
                    s3Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    return;
                }
                s3Var2.j();
                return;
            default:
                s3 s3Var3 = this.f1502b;
                s3Var3.f1510e.N(true);
                s3Var3.f1515n.N(true);
                return;
        }
    }
}
