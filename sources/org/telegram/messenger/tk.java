package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class tk implements Runnable {
    public final int f18272a;
    public final wp f18273b;
    public final TL_update.TL_updatePeerBlocked f18274c;

    public tk(wp wpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f18272a = i10;
        this.f18273b = wpVar;
        this.f18274c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f18272a) {
            case 0:
                i0.g3(new tk(this.f18273b, this.f18274c, 1));
                return;
            default:
                wp wpVar = this.f18273b;
                LongSparseIntArray longSparseIntArray = wpVar.G0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f18274c;
                long C1 = kj.C1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(C1) < 0) {
                        longSparseIntArray.put(C1, 1);
                    }
                } else {
                    longSparseIntArray.delete(C1);
                }
                wpVar.getNotificationCenter().k(43, new Object[0]);
                wpVar.O1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
