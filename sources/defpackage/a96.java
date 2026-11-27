package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class a96 implements Runnable {
    public final byte a;
    public final c58 b;

    public a96(c58 c58Var, byte b) {
        this.a = b;
        this.b = c58Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c58 c58Var = this.b;
        switch (b) {
            case 0:
                c58Var.a();
                return;
            case 1:
                if (c58Var.P != null && !c58Var.V) {
                    hl.r(c58Var.W);
                    c58Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = c58Var.P;
                    ConnectionsManager.getInstance(c58Var.O).sendRequestTyped(getgroupcallstars, new ic((byte) 0), new qe2(c58Var, getgroupcallstars, (byte) 27));
                    return;
                }
                return;
            case 2:
                hl.r(c58Var.e0);
                v21 v21Var = c58Var.a0;
                if (v21Var != null) {
                    v21Var.b();
                    c58Var.a0 = null;
                }
                long j = c58Var.S;
                if (j > 0) {
                    c58Var.S = 0L;
                    c58Var.T = true;
                    c58Var.n(new TLRPC.TL_textWithEntities(), j);
                    return;
                }
                c58Var.i();
                return;
            default:
                c58Var.e.O(true);
                c58Var.n.O(true);
                return;
        }
    }
}
