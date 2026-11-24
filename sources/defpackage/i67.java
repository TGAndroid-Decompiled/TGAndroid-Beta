package defpackage;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class i67 implements Runnable {
    public final byte a;
    public final na7 b;
    public final long c;
    public final int d;
    public final int e;
    public final boolean f;

    public i67(na7 na7Var, long j, int i, int i2, boolean z, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    @Override
    public final void run() {
        long j;
        int i;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                vf6 vf6Var = na7Var.R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var.f(j2);
                int i2 = this.e;
                if (dialog != null) {
                    int i3 = dialog.unread_count;
                    int i4 = this.d;
                    if (i4 != 0 && i2 < dialog.top_message) {
                        int max = Math.max(i3 - i4, 0);
                        dialog.unread_count = max;
                        if (i2 != Integer.MIN_VALUE && max > (i = dialog.top_message - i2)) {
                            dialog.unread_count = i;
                        }
                    } else {
                        dialog.unread_count = 0;
                    }
                    boolean z = dialog.unread_mark;
                    if (z) {
                        dialog.unread_mark = false;
                        na7Var.getMessagesStorage().C1(dialog.id, false);
                    }
                    if ((i3 != 0 || z) && dialog.unread_count == 0) {
                        j = j2;
                        na7Var.n2(j, 0L, null);
                        if (na7Var.j0()) {
                            na7Var.Z4(null);
                            na7Var.getNotificationCenter().k(3, new Object[0]);
                        }
                    } else {
                        j = j2;
                    }
                    na7Var.getNotificationCenter().k(2, 256);
                } else {
                    j = j2;
                }
                long j3 = j;
                if (!this.f) {
                    na7Var.getNotificationsController().L(null, j3, 0, i2, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j3, 0);
                    na7Var.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                na7Var.getNotificationsController().L(null, j3, 0, i2, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j3, -1);
                na7Var.getNotificationsController().J(longSparseIntArray2);
                return;
            default:
                gl.c3(new i67(this.b, this.c, this.d, this.e, this.f, (byte) 0));
                return;
        }
    }
}
