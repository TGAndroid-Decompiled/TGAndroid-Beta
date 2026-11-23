package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class sv implements Runnable {
    public final int f26875a;
    public final yv f26876b;
    public final long f26877c;

    public sv(yv yvVar, long j3, int i7) {
        this.f26875a = i7;
        this.f26876b = yvVar;
        this.f26877c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26875a;
        long j3 = this.f26877c;
        yv yvVar = this.f26876b;
        switch (i7) {
            case 0:
                a0.h hVar = yvVar.getMessagesController().R;
                long j10 = this.f26877c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    yvVar.getMessagesController().S.l(dialog.f28402id);
                }
                yvVar.getMessagesStorage().f27214a.c(new sv(yvVar, j10, 1));
                ur messagesStorage = yvVar.getMessagesStorage();
                messagesStorage.f27214a.c(new wp(messagesStorage, 1, j10, 1));
                yvVar.getNotificationCenter().k(3, new Object[0]);
                yvVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                return;
            case 1:
                g0.g3(new sv(yvVar, j3, 2));
                return;
            case 2:
                ys notificationsController = yvVar.getNotificationsController();
                long j11 = this.f26877c;
                notificationsController.L(null, j11, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                yvVar.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                yvVar.getMessagesController().X(0, j3, false);
                return;
        }
    }
}
