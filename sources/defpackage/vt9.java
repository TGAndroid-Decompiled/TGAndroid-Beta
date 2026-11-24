package defpackage;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class vt9 implements Runnable {
    public final byte a;
    public final bu9 b;
    public final long c;

    public vt9(bu9 bu9Var, long j, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                vf6 vf6Var = bu9Var.getMessagesController().R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var.f(j2);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    bu9Var.getMessagesController().S.l(dialog.id);
                }
                bu9Var.getMessagesStorage().a.c(new vt9(bu9Var, j2, (byte) 1));
                ad7 messagesStorage = bu9Var.getMessagesStorage();
                messagesStorage.a.c(new bb7(messagesStorage, 1, j2, (byte) 1));
                bu9Var.getNotificationCenter().k(3, new Object[0]);
                bu9Var.getNotificationCenter().k(41, Long.valueOf(j2), Boolean.FALSE, null);
                return;
            case 1:
                gl.c3(new vt9(bu9Var, j, (byte) 2));
                return;
            case 2:
                im7 notificationsController = bu9Var.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, 0, Integer.MAX_VALUE, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                bu9Var.getNotificationsController().J(longSparseIntArray);
                return;
            default:
                bu9Var.getMessagesController().T(0, j, false);
                return;
        }
    }
}
