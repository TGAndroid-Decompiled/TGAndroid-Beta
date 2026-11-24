package defpackage;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class p77 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TL_update.TL_updatePeerBlocked c;

    public p77(oc7 oc7Var, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new p77(oc7Var, tL_updatePeerBlocked, (byte) 1));
                return;
            default:
                long B1 = k47.B1(tL_updatePeerBlocked.peer_id);
                boolean z = tL_updatePeerBlocked.blocked;
                LongSparseIntArray longSparseIntArray = oc7Var.x0;
                if (z) {
                    if (longSparseIntArray.indexOfKey(B1) < 0) {
                        longSparseIntArray.put(B1, 1);
                    }
                } else {
                    longSparseIntArray.delete(B1);
                }
                oc7Var.getNotificationCenter().k(44, new Object[0]);
                oc7Var.N1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
