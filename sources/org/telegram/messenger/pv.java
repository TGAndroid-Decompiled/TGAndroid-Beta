package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class pv implements Runnable {
    public final int f24802a;
    public final vv f24803b;
    public final long f24804c;

    public pv(vv vvVar, long j10, int i3) {
        this.f24802a = i3;
        this.f24803b = vvVar;
        this.f24804c = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f24802a;
        long j10 = this.f24804c;
        vv vvVar = this.f24803b;
        switch (i3) {
            case 0:
                a0.h hVar = vvVar.getMessagesController().R;
                long j11 = this.f24804c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    vvVar.getMessagesController().S.l(dialog.f27005id);
                }
                vvVar.getMessagesStorage().f24934a.c(new pv(vvVar, j11, 1));
                qr messagesStorage = vvVar.getMessagesStorage();
                messagesStorage.f24934a.c(new rp(messagesStorage, 1, j11, 1));
                vvVar.getNotificationCenter().k(3, new Object[0]);
                vvVar.getNotificationCenter().k(41, Long.valueOf(j11), Boolean.FALSE, null);
                return;
            case 1:
                g0.h3(new pv(vvVar, j10, 2));
                return;
            case 2:
                us notificationsController = vvVar.getNotificationsController();
                long j12 = this.f24804c;
                notificationsController.L(null, j12, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j12, 0);
                vvVar.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                vvVar.getMessagesController().X(0, j10, false);
                return;
        }
    }
}
