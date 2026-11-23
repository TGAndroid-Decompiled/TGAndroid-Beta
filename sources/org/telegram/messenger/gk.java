package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class gk implements Runnable {
    public final int f24275a;
    public final np f24276b;
    public final TL_update.TL_updatePeerBlocked f24277c;

    public gk(np npVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.f24275a = i7;
        this.f24276b = npVar;
        this.f24277c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f24275a) {
            case 0:
                g0.g3(new gk(this.f24276b, this.f24277c, 1));
                return;
            default:
                np npVar = this.f24276b;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f24277c;
                long B1 = gj.B1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(B1) < 0) {
                        longSparseIntArray.put(B1, 1);
                    }
                } else {
                    longSparseIntArray.delete(B1);
                }
                npVar.getNotificationCenter().k(43, new Object[0]);
                npVar.R1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
