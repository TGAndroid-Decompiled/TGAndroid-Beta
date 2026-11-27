package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class a96 implements Runnable {
    public final byte a;
    public final b58 b;

    public a96(b58 b58Var, byte b) {
        this.a = b;
        this.b = b58Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        b58 b58Var = this.b;
        switch (b) {
            case 0:
                b58Var.a();
                return;
            case 1:
                if (b58Var.P != null && !b58Var.V) {
                    hl.r(b58Var.W);
                    b58Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = b58Var.P;
                    ConnectionsManager.getInstance(b58Var.O).sendRequestTyped(getgroupcallstars, new ic((byte) 0), new qe2(b58Var, getgroupcallstars, (byte) 27));
                    return;
                }
                return;
            case 2:
                hl.r(b58Var.e0);
                v21 v21Var = b58Var.a0;
                if (v21Var != null) {
                    v21Var.b();
                    b58Var.a0 = null;
                }
                long j = b58Var.S;
                if (j > 0) {
                    b58Var.S = 0L;
                    b58Var.T = true;
                    b58Var.n(new TLRPC.TL_textWithEntities(), j);
                    return;
                }
                b58Var.i();
                return;
            default:
                b58Var.e.O(true);
                b58Var.n.O(true);
                return;
        }
    }
}
