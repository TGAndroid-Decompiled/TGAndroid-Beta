package defpackage;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ox9 implements Runnable {
    public final byte a;
    public final wx9 b;
    public final long c;

    public ox9(wx9 wx9Var, long j, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                zh6 zh6Var = wx9Var.getMessagesController().R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) zh6Var.f(j2);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    wx9Var.getMessagesController().S.l(dialog.id);
                }
                wx9Var.getMessagesStorage().a.c(new ox9(wx9Var, j2, (byte) 1));
                kf7 messagesStorage = wx9Var.getMessagesStorage();
                messagesStorage.a.c(new id7(messagesStorage, 1, j2, (byte) 0));
                wx9Var.getNotificationCenter().k(3, new Object[0]);
                wx9Var.getNotificationCenter().k(42, Long.valueOf(j2), Boolean.FALSE, null);
                return;
            case 1:
                hl.c3(new ox9(wx9Var, j, (byte) 2));
                return;
            case 2:
                ip7 notificationsController = wx9Var.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                wx9Var.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                wx9Var.getMessagesController().V(0, j, false);
                return;
        }
    }
}
