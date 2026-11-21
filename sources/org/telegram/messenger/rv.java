package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class rv implements Runnable {
    public final int f26725a;
    public final xv f26726b;
    public final long f26727c;

    public rv(xv xvVar, long j3, int i7) {
        this.f26725a = i7;
        this.f26726b = xvVar;
        this.f26727c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26725a;
        long j3 = this.f26727c;
        xv xvVar = this.f26726b;
        switch (i7) {
            case 0:
                a0.h hVar = xvVar.getMessagesController().R;
                long j10 = this.f26727c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    xvVar.getMessagesController().S.l(dialog.f28435id);
                }
                xvVar.getMessagesStorage().f27080a.c(new rv(xvVar, j10, 1));
                tr messagesStorage = xvVar.getMessagesStorage();
                messagesStorage.f27080a.c(new vp(messagesStorage, 1, j10, 1));
                xvVar.getNotificationCenter().k(3, new Object[0]);
                xvVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                return;
            case 1:
                g0.g3(new rv(xvVar, j3, 2));
                return;
            case 2:
                xs notificationsController = xvVar.getNotificationsController();
                long j11 = this.f26727c;
                notificationsController.L(null, j11, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                xvVar.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                xvVar.getMessagesController().X(0, j3, false);
                return;
        }
    }
}
