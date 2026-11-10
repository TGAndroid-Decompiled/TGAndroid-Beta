package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class ik implements Runnable {
    public final int f23326a;
    public final qp f23327b;
    public final TL_update.TL_updatePeerBlocked f23328c;

    public ik(qp qpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.f23326a = i7;
        this.f23327b = qpVar;
        this.f23328c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f23326a) {
            case 0:
                g0.h3(new ik(this.f23327b, this.f23328c, 1));
                return;
            default:
                qp qpVar = this.f23327b;
                LongSparseIntArray longSparseIntArray = qpVar.G0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f23328c;
                long B1 = ij.B1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(B1) < 0) {
                        longSparseIntArray.put(B1, 1);
                    }
                } else {
                    longSparseIntArray.delete(B1);
                }
                qpVar.getNotificationCenter().k(43, new Object[0]);
                qpVar.P1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
