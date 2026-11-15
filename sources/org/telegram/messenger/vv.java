package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f27249a;
    public final bw f27250b;
    public final long f27251c;

    public vv(bw bwVar, long j3, int i7) {
        this.f27249a = i7;
        this.f27250b = bwVar;
        this.f27251c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27249a;
        long j3 = this.f27251c;
        bw bwVar = this.f27250b;
        switch (i7) {
            case 0:
                a0.h hVar = bwVar.getMessagesController().R;
                long j10 = this.f27251c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    bwVar.getMessagesController().S.l(dialog.f28055id);
                }
                bwVar.getMessagesStorage().f27220a.c(new vv(bwVar, j10, 1));
                vr messagesStorage = bwVar.getMessagesStorage();
                messagesStorage.f27220a.c(new xp(messagesStorage, 1, j10, 1));
                bwVar.getNotificationCenter().k(3, new Object[0]);
                bwVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                return;
            case 1:
                g0.h3(new vv(bwVar, j3, 2));
                return;
            case 2:
                at notificationsController = bwVar.getNotificationsController();
                long j11 = this.f27251c;
                notificationsController.L(null, j11, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                bwVar.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                bwVar.getMessagesController().X(0, j3, false);
                return;
        }
    }
}
