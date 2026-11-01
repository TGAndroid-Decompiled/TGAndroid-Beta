package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qj implements Runnable {
    public final int f17782a;
    public final vs f17783b;
    public final long f17784c;
    public final int d;
    public final int e;
    public final boolean f17785f;

    public qj(wp wpVar, long j10, int i10, int i11, boolean z10, int i12) {
        this.f17782a = i12;
        this.f17783b = wpVar;
        this.f17784c = j10;
        this.d = i10;
        this.e = i11;
        this.f17785f = z10;
    }

    @Override
    public final void run() {
        long j10;
        int i10;
        int i11 = this.f17782a;
        vs vsVar = this.f17783b;
        switch (i11) {
            case 0:
                wp wpVar = (wp) vsVar;
                a0.h hVar = wpVar.Q;
                long j11 = this.f17784c;
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
                        wpVar.getMessagesStorage().F1(dialog.f19798id, false);
                    }
                    if ((i13 == 0 && !z10) || dialog.unread_count != 0) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        wpVar.q2(j10, 0L, null);
                        int i15 = 0;
                        while (true) {
                            bp[] bpVarArr = wpVar.M;
                            if (i15 < bpVarArr.length) {
                                bp bpVar = bpVarArr[i15];
                                if (bpVar != null && (bpVar.f15004g & 64) != 0) {
                                    wpVar.Q4(null);
                                    wpVar.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    wpVar.getNotificationCenter().k(2, 256);
                } else {
                    j10 = j11;
                }
                if (!this.f17785f) {
                    long j12 = j10;
                    wpVar.getNotificationsController().L(null, j12, 0, i12, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j12, 0);
                    wpVar.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                long j13 = j10;
                wpVar.getNotificationsController().L(null, j13, 0, i12, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j13, -1);
                wpVar.getNotificationsController().J(longSparseIntArray2);
                return;
            case 1:
                i0.g3(new qj((wp) vsVar, this.f17784c, this.d, this.e, this.f17785f, 0));
                return;
            default:
                int i16 = ChatActivityEnterView.f23673s5;
                ((ChatActivityEnterView) vsVar).R0(this.f17785f, this.d, this.e, this.f17784c, false);
                return;
        }
    }

    public qj(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f17782a = 2;
        this.f17783b = chatActivityEnterView;
        this.f17785f = z10;
        this.d = i10;
        this.e = i11;
        this.f17784c = j10;
    }
}
