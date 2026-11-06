package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class xv implements Runnable {
    public final int f26520a;
    public final dw f26521b;
    public final long f26522c;

    public xv(dw dwVar, long j3, int i7) {
        this.f26520a = i7;
        this.f26521b = dwVar;
        this.f26522c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26520a;
        long j3 = this.f26522c;
        dw dwVar = this.f26521b;
        switch (i7) {
            case 0:
                a0.h hVar = dwVar.getMessagesController().Q;
                long j10 = this.f26522c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    dwVar.getMessagesController().R.l(dialog.f26957id);
                }
                dwVar.getMessagesStorage().f26696a.c(new xv(dwVar, j10, 1));
                yr messagesStorage = dwVar.getMessagesStorage();
                messagesStorage.f26696a.c(new aq(messagesStorage, 1, j10, 1));
                dwVar.getNotificationCenter().k(3, new Object[0]);
                dwVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                return;
            case 1:
                g0.h3(new xv(dwVar, j3, 2));
                return;
            case 2:
                dt notificationsController = dwVar.getNotificationsController();
                long j11 = this.f26522c;
                notificationsController.L(null, j11, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                dwVar.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                dwVar.getMessagesController().X(0, j3, false);
                return;
        }
    }
}
