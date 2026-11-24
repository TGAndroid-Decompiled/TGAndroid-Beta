package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class w86 implements Runnable {
    public final byte a;
    public final n38 b;

    public w86(n38 n38Var, byte b) {
        this.a = b;
        this.b = n38Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        n38 n38Var = this.b;
        switch (b) {
            case 0:
                n38Var.a();
                return;
            case 1:
                if (n38Var.P != null && !n38Var.V) {
                    gm.r(n38Var.W);
                    n38Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = n38Var.P;
                    ConnectionsManager.getInstance(n38Var.O).sendRequestTyped(getgroupcallstars, new kc((byte) 0), new lf2(n38Var, getgroupcallstars, (byte) 29));
                    return;
                }
                return;
            case 2:
                gm.r(n38Var.e0);
                u31 u31Var = n38Var.a0;
                if (u31Var != null) {
                    u31Var.b();
                    n38Var.a0 = null;
                }
                long j = n38Var.S;
                if (j > 0) {
                    n38Var.S = 0L;
                    n38Var.T = true;
                    n38Var.n(new TLRPC.TL_textWithEntities(), j);
                    return;
                }
                n38Var.i();
                return;
            default:
                n38Var.e.O(true);
                n38Var.n.O(true);
                return;
        }
    }
}
