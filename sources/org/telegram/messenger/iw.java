package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class iw implements Runnable {
    public final int f16181a;
    public final ow f16182b;
    public final long f16183c;

    public iw(ow owVar, long j10, int i10) {
        this.f16181a = i10;
        this.f16182b = owVar;
        this.f16183c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f16181a;
        long j10 = this.f16183c;
        ow owVar = this.f16182b;
        switch (i10) {
            case 0:
                a0.h hVar = owVar.getMessagesController().Q;
                long j11 = this.f16183c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    owVar.getMessagesController().R.l(dialog.f19797id);
                }
                owVar.getMessagesStorage().f15938a.c(new iw(owVar, j11, 1));
                hs messagesStorage = owVar.getMessagesStorage();
                messagesStorage.f15938a.c(new gq(messagesStorage, 1, j11, 1));
                owVar.getNotificationCenter().k(3, new Object[0]);
                owVar.getNotificationCenter().k(41, Long.valueOf(j11), Boolean.FALSE, null);
                return;
            case 1:
                i0.g3(new iw(owVar, j10, 2));
                return;
            case 2:
                ot notificationsController = owVar.getNotificationsController();
                long j12 = this.f16183c;
                notificationsController.L(null, j12, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j12, 0);
                owVar.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                owVar.getMessagesController().X(0, j10, false);
                return;
        }
    }
}
