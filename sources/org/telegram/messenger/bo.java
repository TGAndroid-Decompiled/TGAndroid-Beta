package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class bo implements Runnable {
    public final int f23109a;
    public final mp f23110b;
    public final long f23111c;
    public final int d;
    public final int f23112e;
    public final boolean f23113f;

    public bo(mp mpVar, long j3, int i7, int i10, boolean z10, int i11) {
        this.f23109a = i11;
        this.f23110b = mpVar;
        this.f23111c = j3;
        this.d = i7;
        this.f23112e = i10;
        this.f23113f = z10;
    }

    @Override
    public final void run() {
        long j3;
        int i7;
        switch (this.f23109a) {
            case 0:
                g0.g3(new bo(this.f23110b, this.f23111c, this.d, this.f23112e, this.f23113f, 1));
                return;
            default:
                mp mpVar = this.f23110b;
                a0.h hVar = mpVar.R;
                long j10 = this.f23111c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                int i10 = this.f23112e;
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
                        mpVar.getMessagesStorage().F1(dialog.f28409id, false);
                    }
                    if ((i11 == 0 && !z10) || dialog.unread_count != 0) {
                        j3 = j10;
                    } else {
                        j3 = j10;
                        mpVar.u2(j3, 0L, null);
                        if (mpVar.n0()) {
                            mpVar.f5(null);
                            mpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    mpVar.getNotificationCenter().k(2, 256);
                } else {
                    j3 = j10;
                }
                if (!this.f23113f) {
                    long j11 = j3;
                    mpVar.getNotificationsController().L(null, j11, 0, i10, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    mpVar.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                long j12 = j3;
                mpVar.getNotificationsController().L(null, j12, 0, i10, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j12, -1);
                mpVar.getNotificationsController().J(longSparseIntArray2);
                return;
        }
    }
}
