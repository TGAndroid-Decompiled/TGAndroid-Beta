package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class il implements Runnable {
    public final int f23308a;
    public final ls f23309b;
    public final long f23310c;
    public final int d;
    public final int f23311e;
    public final boolean f23312f;

    public il(qp qpVar, long j3, int i7, int i10, boolean z9, int i11) {
        this.f23308a = i11;
        this.f23309b = qpVar;
        this.f23310c = j3;
        this.d = i7;
        this.f23311e = i10;
        this.f23312f = z9;
    }

    @Override
    public final void run() {
        long j3;
        int i7;
        int i10 = this.f23308a;
        ls lsVar = this.f23309b;
        switch (i10) {
            case 0:
                qp qpVar = (qp) lsVar;
                a0.h hVar = qpVar.Q;
                long j10 = this.f23310c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                int i11 = this.f23311e;
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
                    boolean z9 = dialog.unread_mark;
                    if (z9) {
                        dialog.unread_mark = false;
                        qpVar.getMessagesStorage().F1(dialog.f26957id, false);
                    }
                    if ((i12 == 0 && !z9) || dialog.unread_count != 0) {
                        j3 = j10;
                    } else {
                        j3 = j10;
                        qpVar.r2(j3, 0L, null);
                        int i14 = 0;
                        while (true) {
                            vo[] voVarArr = qpVar.M;
                            if (i14 < voVarArr.length) {
                                vo voVar = voVarArr[i14];
                                if (voVar != null && (voVar.f26069g & 64) != 0) {
                                    qpVar.T4(null);
                                    qpVar.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    qpVar.getNotificationCenter().k(2, 256);
                } else {
                    j3 = j10;
                }
                if (!this.f23312f) {
                    long j11 = j3;
                    qpVar.getNotificationsController().L(null, j11, 0, i11, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    qpVar.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                long j12 = j3;
                qpVar.getNotificationsController().L(null, j12, 0, i11, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j12, -1);
                qpVar.getNotificationsController().J(longSparseIntArray2);
                return;
            case 1:
                g0.h3(new il((qp) lsVar, this.f23310c, this.d, this.f23311e, this.f23312f, 0));
                return;
            default:
                int i15 = ChatActivityEnterView.s5;
                ((ChatActivityEnterView) lsVar).T0(this.f23312f, this.d, this.f23311e, this.f23310c, false);
                return;
        }
    }

    public il(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7, int i10, long j3) {
        this.f23308a = 2;
        this.f23309b = chatActivityEnterView;
        this.f23312f = z9;
        this.d = i7;
        this.f23311e = i10;
        this.f23310c = j3;
    }
}
