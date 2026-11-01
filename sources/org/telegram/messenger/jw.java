package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class jw implements Runnable {
    public final int f16517a;
    public final pw f16518b;
    public final long f16519c;

    public jw(pw pwVar, long j10, int i10) {
        this.f16517a = i10;
        this.f16518b = pwVar;
        this.f16519c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f16517a;
        long j10 = this.f16519c;
        pw pwVar = this.f16518b;
        switch (i10) {
            case 0:
                a0.h hVar = pwVar.getMessagesController().Q;
                long j11 = this.f16519c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    pwVar.getMessagesController().R.l(dialog.f19798id);
                }
                pwVar.getMessagesStorage().f16331a.c(new jw(pwVar, j11, 1));
                is messagesStorage = pwVar.getMessagesStorage();
                messagesStorage.f16331a.c(new hq(messagesStorage, 1, j11, 1));
                pwVar.getNotificationCenter().k(3, new Object[0]);
                pwVar.getNotificationCenter().k(41, Long.valueOf(j11), Boolean.FALSE, null);
                return;
            case 1:
                i0.g3(new jw(pwVar, j10, 2));
                return;
            case 2:
                pt notificationsController = pwVar.getNotificationsController();
                long j12 = this.f16519c;
                notificationsController.L(null, j12, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j12, 0);
                pwVar.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                pwVar.getMessagesController().X(0, j10, false);
                return;
        }
    }
}
