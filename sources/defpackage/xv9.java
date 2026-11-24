package defpackage;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class xv9 implements Runnable {
    public final byte a;
    public final dw9 b;
    public final long c;

    public xv9(dw9 dw9Var, long j, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                vh6 vh6Var = dw9Var.getMessagesController().R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var.f(j2);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    dw9Var.getMessagesController().S.l(dialog.id);
                }
                dw9Var.getMessagesStorage().a.c(new xv9(dw9Var, j2, (byte) 1));
                cf7 messagesStorage = dw9Var.getMessagesStorage();
                messagesStorage.a.c(new cd7(messagesStorage, 1, j2, (byte) 1));
                dw9Var.getNotificationCenter().k(3, new Object[0]);
                dw9Var.getNotificationCenter().k(42, Long.valueOf(j2), Boolean.FALSE, null);
                return;
            case 1:
                gm.c3(new xv9(dw9Var, j, (byte) 2));
                return;
            case 2:
                lo7 notificationsController = dw9Var.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                dw9Var.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                dw9Var.getMessagesController().T(0, j, false);
                return;
        }
    }
}
