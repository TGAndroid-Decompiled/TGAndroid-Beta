package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class jk implements Runnable {
    public final int f23544a;
    public final qp f23545b;
    public final TL_update.TL_updatePeerBlocked f23546c;

    public jk(qp qpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.f23544a = i7;
        this.f23545b = qpVar;
        this.f23546c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f23544a) {
            case 0:
                g0.h3(new jk(this.f23545b, this.f23546c, 1));
                return;
            default:
                qp qpVar = this.f23545b;
                LongSparseIntArray longSparseIntArray = qpVar.G0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f23546c;
                long C1 = ij.C1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(C1) < 0) {
                        longSparseIntArray.put(C1, 1);
                    }
                } else {
                    longSparseIntArray.delete(C1);
                }
                qpVar.getNotificationCenter().k(43, new Object[0]);
                qpVar.P1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
