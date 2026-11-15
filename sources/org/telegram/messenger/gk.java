package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class gk implements Runnable {
    public final int f23881a;
    public final np f23882b;
    public final TL_update.TL_updatePeerBlocked f23883c;

    public gk(np npVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.f23881a = i7;
        this.f23882b = npVar;
        this.f23883c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f23881a) {
            case 0:
                g0.h3(new gk(this.f23882b, this.f23883c, 1));
                return;
            default:
                np npVar = this.f23882b;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f23883c;
                long B1 = gj.B1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(B1) < 0) {
                        longSparseIntArray.put(B1, 1);
                    }
                } else {
                    longSparseIntArray.delete(B1);
                }
                npVar.getNotificationCenter().k(43, new Object[0]);
                npVar.P1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
