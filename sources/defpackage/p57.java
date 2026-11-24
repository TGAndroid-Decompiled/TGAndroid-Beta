package defpackage;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class p57 implements Runnable {
    public final byte a;
    public final na7 b;
    public final TL_update.TL_updatePeerBlocked c;

    public p57(na7 na7Var, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new p57(na7Var, tL_updatePeerBlocked, (byte) 1));
                return;
            default:
                long B1 = k27.B1(tL_updatePeerBlocked.peer_id);
                boolean z = tL_updatePeerBlocked.blocked;
                LongSparseIntArray longSparseIntArray = na7Var.x0;
                if (z) {
                    if (longSparseIntArray.indexOfKey(B1) < 0) {
                        longSparseIntArray.put(B1, 1);
                    }
                } else {
                    longSparseIntArray.delete(B1);
                }
                na7Var.getNotificationCenter().k(43, new Object[0]);
                na7Var.M1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
