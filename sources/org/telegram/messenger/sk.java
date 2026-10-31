package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class sk implements Runnable {
    public final int f17921a;
    public final vp f17922b;
    public final TL_update.TL_updatePeerBlocked f17923c;

    public sk(vp vpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f17921a = i10;
        this.f17922b = vpVar;
        this.f17923c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                i0.g3(new sk(this.f17922b, this.f17923c, 1));
                return;
            default:
                vp vpVar = this.f17922b;
                LongSparseIntArray longSparseIntArray = vpVar.G0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f17923c;
                long C1 = jj.C1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(C1) < 0) {
                        longSparseIntArray.put(C1, 1);
                    }
                } else {
                    longSparseIntArray.delete(C1);
                }
                vpVar.getNotificationCenter().k(43, new Object[0]);
                vpVar.O1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
