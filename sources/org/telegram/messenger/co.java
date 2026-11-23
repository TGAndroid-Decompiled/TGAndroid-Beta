package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class co implements Runnable {
    public final int f23348a;
    public final np f23349b;
    public final long f23350c;
    public final int d;
    public final int f23351e;
    public final boolean f23352f;

    public co(np npVar, long j3, int i7, int i10, boolean z10, int i11) {
        this.f23348a = i11;
        this.f23349b = npVar;
        this.f23350c = j3;
        this.d = i7;
        this.f23351e = i10;
        this.f23352f = z10;
    }

    @Override
    public final void run() {
        long j3;
        int i7;
        switch (this.f23348a) {
            case 0:
                g0.g3(new co(this.f23349b, this.f23350c, this.d, this.f23351e, this.f23352f, 1));
                return;
            default:
                np npVar = this.f23349b;
                a0.h hVar = npVar.R;
                long j10 = this.f23350c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                int i10 = this.f23351e;
                if (dialog != null) {
                    int i11 = dialog.unread_count;
                    int i12 = this.d;
                    if (i12 != 0 && i10 < dialog.top_message) {
                        int max = Math.max(i11 - i12, 0);
                        dialog.unread_count = max;
                        if (i10 != Integer.MIN_VALUE && max > (i7 = dialog.top_message - i10)) {
                            dialog.unread_count = i7;
                        }
                    } else {
                        dialog.unread_count = 0;
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        npVar.getMessagesStorage().F1(dialog.f28438id, false);
                    }
                    if ((i11 == 0 && !z10) || dialog.unread_count != 0) {
                        j3 = j10;
                    } else {
                        j3 = j10;
                        npVar.u2(j3, 0L, null);
                        if (npVar.n0()) {
                            npVar.f5(null);
                            npVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    npVar.getNotificationCenter().k(2, 256);
                } else {
                    j3 = j10;
                }
                if (!this.f23352f) {
                    long j11 = j3;
                    npVar.getNotificationsController().L(null, j11, 0, i10, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    npVar.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                long j12 = j3;
                npVar.getNotificationsController().L(null, j12, 0, i10, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j12, -1);
                npVar.getNotificationsController().J(longSparseIntArray2);
                return;
        }
    }
}
