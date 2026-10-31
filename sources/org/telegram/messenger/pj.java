package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pj implements Runnable {
    public final int f17447a;
    public final us f17448b;
    public final long f17449c;
    public final int d;
    public final int e;
    public final boolean f17450f;

    public pj(vp vpVar, long j10, int i10, int i11, boolean z10, int i12) {
        this.f17447a = i12;
        this.f17448b = vpVar;
        this.f17449c = j10;
        this.d = i10;
        this.e = i11;
        this.f17450f = z10;
    }

    @Override
    public final void run() {
        long j10;
        int i10;
        int i11 = this.f17447a;
        us usVar = this.f17448b;
        switch (i11) {
            case 0:
                vp vpVar = (vp) usVar;
                a0.h hVar = vpVar.Q;
                long j11 = this.f17449c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                int i12 = this.e;
                if (dialog != null) {
                    int i13 = dialog.unread_count;
                    int i14 = this.d;
                    if (i14 != 0 && i12 < dialog.top_message) {
                        int max = Math.max(i13 - i14, 0);
                        dialog.unread_count = max;
                        if (i12 != Integer.MIN_VALUE && max > (i10 = dialog.top_message - i12)) {
                            dialog.unread_count = i10;
                        }
                    } else {
                        dialog.unread_count = 0;
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        vpVar.getMessagesStorage().F1(dialog.f19797id, false);
                    }
                    if ((i13 == 0 && !z10) || dialog.unread_count != 0) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        vpVar.q2(j10, 0L, null);
                        int i15 = 0;
                        while (true) {
                            ap[] apVarArr = vpVar.M;
                            if (i15 < apVarArr.length) {
                                ap apVar = apVarArr[i15];
                                if (apVar != null && (apVar.f14649g & 64) != 0) {
                                    vpVar.Q4(null);
                                    vpVar.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    vpVar.getNotificationCenter().k(2, 256);
                } else {
                    j10 = j11;
                }
                if (!this.f17450f) {
                    long j12 = j10;
                    vpVar.getNotificationsController().L(null, j12, 0, i12, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j12, 0);
                    vpVar.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                long j13 = j10;
                vpVar.getNotificationsController().L(null, j13, 0, i12, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j13, -1);
                vpVar.getNotificationsController().J(longSparseIntArray2);
                return;
            case 1:
                i0.g3(new pj((vp) usVar, this.f17449c, this.d, this.e, this.f17450f, 0));
                return;
            default:
                int i16 = ChatActivityEnterView.f23672s5;
                ((ChatActivityEnterView) usVar).R0(this.f17450f, this.d, this.e, this.f17449c, false);
                return;
        }
    }

    public pj(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f17447a = 2;
        this.f17448b = chatActivityEnterView;
        this.f17450f = z10;
        this.d = i10;
        this.e = i11;
        this.f17449c = j10;
    }
}
