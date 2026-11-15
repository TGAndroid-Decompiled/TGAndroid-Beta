package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class el implements Runnable {
    public final int f23320a;
    public final is f23321b;
    public final long f23322c;
    public final int d;
    public final int f23323e;
    public final boolean f23324f;

    public el(np npVar, long j3, int i7, int i10, boolean z10, int i11) {
        this.f23320a = i11;
        this.f23321b = npVar;
        this.f23322c = j3;
        this.d = i7;
        this.f23323e = i10;
        this.f23324f = z10;
    }

    @Override
    public final void run() {
        long j3;
        int i7;
        int i10 = this.f23320a;
        is isVar = this.f23321b;
        switch (i10) {
            case 0:
                np npVar = (np) isVar;
                a0.h hVar = npVar.R;
                long j10 = this.f23322c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                int i11 = this.f23323e;
                if (dialog != null) {
                    int i12 = dialog.unread_count;
                    int i13 = this.d;
                    if (i13 != 0 && i11 < dialog.top_message) {
                        int max = Math.max(i12 - i13, 0);
                        dialog.unread_count = max;
                        if (i11 != Integer.MIN_VALUE && max > (i7 = dialog.top_message - i11)) {
                            dialog.unread_count = i7;
                        }
                    } else {
                        dialog.unread_count = 0;
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        npVar.getMessagesStorage().F1(dialog.f28055id, false);
                    }
                    if ((i12 == 0 && !z10) || dialog.unread_count != 0) {
                        j3 = j10;
                    } else {
                        j3 = j10;
                        npVar.r2(j3, 0L, null);
                        int i14 = 0;
                        while (true) {
                            so[] soVarArr = npVar.N;
                            if (i14 < soVarArr.length) {
                                so soVar = soVarArr[i14];
                                if (soVar != null && (soVar.f26547g & 64) != 0) {
                                    npVar.U4(null);
                                    npVar.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    npVar.getNotificationCenter().k(2, 256);
                } else {
                    j3 = j10;
                }
                if (!this.f23324f) {
                    long j11 = j3;
                    npVar.getNotificationsController().L(null, j11, 0, i11, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    npVar.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                long j12 = j3;
                npVar.getNotificationsController().L(null, j12, 0, i11, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j12, -1);
                npVar.getNotificationsController().J(longSparseIntArray2);
                return;
            case 1:
                g0.h3(new el((np) isVar, this.f23322c, this.d, this.f23323e, this.f23324f, 0));
                return;
            default:
                int i15 = ChatActivityEnterView.N6;
                ((ChatActivityEnterView) isVar).k1(this.f23324f, this.d, this.f23323e, this.f23322c, false);
                return;
        }
    }

    public el(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.f23320a = 2;
        this.f23321b = chatActivityEnterView;
        this.f23324f = z10;
        this.d = i7;
        this.f23323e = i10;
        this.f23322c = j3;
    }
}
