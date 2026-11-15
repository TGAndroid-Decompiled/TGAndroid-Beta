package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f27248a;
    public final bw f27249b;
    public final long f27250c;

    public vv(bw bwVar, long j3, int i7) {
        this.f27248a = i7;
        this.f27249b = bwVar;
        this.f27250c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27248a;
        long j3 = this.f27250c;
        bw bwVar = this.f27249b;
        switch (i7) {
            case 0:
                a0.h hVar = bwVar.getMessagesController().R;
                long j10 = this.f27250c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    bwVar.getMessagesController().S.l(dialog.f28055id);
                }
                bwVar.getMessagesStorage().f27219a.c(new vv(bwVar, j10, 1));
                vr messagesStorage = bwVar.getMessagesStorage();
                messagesStorage.f27219a.c(new wp(messagesStorage, 1, j10, 1));
                bwVar.getNotificationCenter().k(3, new Object[0]);
                bwVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                return;
            case 1:
                g0.h3(new vv(bwVar, j3, 2));
                return;
            case 2:
                at notificationsController = bwVar.getNotificationsController();
                long j11 = this.f27250c;
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
