package org.telegram.messenger;

import android.util.SparseArray;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f27462a;
    public final Object f27463b;
    public final Object f27464c;

    public x4(int i7, Object obj, Object obj2) {
        this.f27462a = i7;
        this.f27463b = obj;
        this.f27464c = obj2;
    }

    private final void a() {
        int i7;
        si siVar = (si) this.f27463b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.f27464c;
        try {
            siVar.getMessagesStorage().f27221b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            siVar.getMessagesStorage().f27221b.beginTransaction();
            siVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = siVar.getMessagesStorage().f27221b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    i7 = 1;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    i7 = 2;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                    i7 = 3;
                } else {
                    i7 = 0;
                }
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, gj.B1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i7);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            siVar.getMessagesStorage().f27221b.commitTransaction();
            g0.h3(new eg(siVar, 6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.x4.run():void");
    }

    public x4(SparseArray sparseArray, Runnable runnable) {
        this.f27462a = 17;
        this.f27464c = sparseArray;
        this.f27463b = runnable;
    }
}
