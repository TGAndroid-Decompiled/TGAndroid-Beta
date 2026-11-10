package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class xv implements Runnable {
    public final int f26531a;
    public final dw f26532b;
    public final long f26533c;

    public xv(dw dwVar, long j3, int i7) {
        this.f26531a = i7;
        this.f26532b = dwVar;
        this.f26533c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26531a;
        long j3 = this.f26533c;
        dw dwVar = this.f26532b;
        switch (i7) {
            case 0:
                a0.h hVar = dwVar.getMessagesController().Q;
                long j10 = this.f26533c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    dwVar.getMessagesController().R.l(dialog.f26964id);
                }
                dwVar.getMessagesStorage().f26723a.c(new xv(dwVar, j10, 1));
                yr messagesStorage = dwVar.getMessagesStorage();
                messagesStorage.f26723a.c(new aq(messagesStorage, 1, j10, 1));
                dwVar.getNotificationCenter().k(3, new Object[0]);
                dwVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                return;
            case 1:
                g0.h3(new xv(dwVar, j3, 2));
                return;
            case 2:
                dt notificationsController = dwVar.getNotificationsController();
                long j11 = this.f26533c;
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
