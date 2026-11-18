package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class fk implements Runnable {
    public final int f24030a;
    public final mp f24031b;
    public final TL_update.TL_updatePeerBlocked f24032c;

    public fk(mp mpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.f24030a = i7;
        this.f24031b = mpVar;
        this.f24032c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f24030a) {
            case 0:
                g0.g3(new fk(this.f24031b, this.f24032c, 1));
                return;
            default:
                mp mpVar = this.f24031b;
                LongSparseIntArray longSparseIntArray = mpVar.H0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f24032c;
                long B1 = fj.B1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(B1) < 0) {
                        longSparseIntArray.put(B1, 1);
                    }
                } else {
                    longSparseIntArray.delete(B1);
                }
                mpVar.getNotificationCenter().k(43, new Object[0]);
                mpVar.R1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
