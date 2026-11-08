package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ul implements Runnable {
    public final int f25864a;
    public final qp f25865b;
    public final long f25866c;
    public final long d;
    public final int f25867e;
    public final ArrayList f25868f;

    public ul(qp qpVar, long j3, int i7, long j10, ArrayList arrayList, int i10) {
        this.f25864a = i10;
        this.f25865b = qpVar;
        this.f25866c = j3;
        this.f25867e = i7;
        this.d = j10;
        this.f25868f = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f25864a;
        ArrayList arrayList = this.f25868f;
        qp qpVar = this.f25865b;
        switch (i7) {
            case 0:
                long j3 = this.f25866c;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                long j10 = this.d;
                int i11 = this.f25867e;
                if (i10 == 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) qpVar.Q.f(j10);
                    if (dialog == null) {
                        qpVar.getMessagesStorage().Q1(j10, i11, true, false);
                        return;
                    }
                    int i12 = dialog.unread_poll_votes_count + i11;
                    dialog.unread_poll_votes_count = i12;
                    if (i12 < 0) {
                        dialog.unread_poll_votes_count = 0;
                    }
                    qpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j10, 0L, false);
                    qpVar.getNotificationCenter().k(302, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = qpVar.getMessagesController().f24877q7.B(i11, j10, j3, true);
                if (B >= 0) {
                    qpVar.getMessagesStorage().h2(B, j10, j3, true);
                    qpVar.getNotificationCenter().k(302, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j11 = this.f25866c;
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                long j12 = this.d;
                int i14 = this.f25867e;
                if (i13 == 0) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar.Q.f(j12);
                    if (dialog2 == null) {
                        qpVar.getMessagesStorage().Q1(j12, i14, true, true);
                        return;
                    }
                    int i15 = dialog2.unread_reactions_count + i14;
                    dialog2.unread_reactions_count = i15;
                    if (i15 < 0) {
                        dialog2.unread_reactions_count = 0;
                    }
                    qpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j12, 0L, false);
                    if (qpVar.t2(j12) || qpVar.y2(j12) || j12 > 0) {
                        qpVar.getNotificationCenter().k(301, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = qpVar.getMessagesController().f24877q7.C(i14, j12, j11, true);
                if (C >= 0) {
                    qpVar.getMessagesStorage().i2(C, j12, j11, true);
                    if (qpVar.t2(j12) || qpVar.y2(j12) || j12 > 0) {
                        qpVar.getNotificationCenter().k(301, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a0.h hVar = qpVar.Q;
                long j13 = this.f25866c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j13);
                int i16 = this.f25867e;
                if (dialog3 == null) {
                    qpVar.getMessagesStorage().Q1(j13, i16, false, false);
                    return;
                }
                dialog3.unread_poll_votes_count = i16;
                yr messagesStorage = qpVar.getMessagesStorage();
                long j14 = this.d;
                messagesStorage.h2(i16, j13, j14, false);
                qpVar.getNotificationCenter().k(302, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i16), arrayList);
                return;
            case 3:
                a0.h hVar2 = qpVar.Q;
                long j15 = this.f25866c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j15);
                int i17 = this.f25867e;
                if (dialog4 == null) {
                    qpVar.getMessagesStorage().Q1(j15, i17, false, true);
                    return;
                }
                dialog4.unread_reactions_count = i17;
                yr messagesStorage2 = qpVar.getMessagesStorage();
                long j16 = this.d;
                messagesStorage2.i2(i17, j15, j16, false);
                qpVar.getNotificationCenter().k(301, Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i17), arrayList);
                return;
            case 4:
                k00 k00Var = qpVar.getMessagesController().f24877q7;
                int i18 = this.f25867e;
                long j17 = this.f25866c;
                long j18 = this.d;
                k00Var.B(i18, j17, j18, false);
                qpVar.getMessagesStorage().h2(i18, j17, j18, false);
                qpVar.getNotificationCenter().k(302, Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(i18), arrayList);
                return;
            case 5:
                k00 k00Var2 = qpVar.getMessagesController().f24877q7;
                int i19 = this.f25867e;
                long j19 = this.f25866c;
                long j20 = this.d;
                k00Var2.C(i19, j19, j20, false);
                qpVar.getMessagesStorage().i2(i19, j19, j20, false);
                qpVar.getNotificationCenter().k(301, Long.valueOf(j19), Long.valueOf(j20), Integer.valueOf(i19), arrayList);
                return;
            default:
                k00 k00Var3 = qpVar.getMessagesController().f24877q7;
                int i20 = this.f25867e;
                long j21 = this.f25866c;
                long j22 = this.d;
                k00Var3.C(i20, j21, j22, false);
                qpVar.getMessagesStorage().i2(i20, j21, j22, false);
                qpVar.getNotificationCenter().k(301, Long.valueOf(j21), Long.valueOf(j22), Integer.valueOf(i20), arrayList);
                return;
        }
    }

    public ul(qp qpVar, long j3, long j10, int i7, ArrayList arrayList, int i10) {
        this.f25864a = i10;
        this.f25865b = qpVar;
        this.f25866c = j3;
        this.d = j10;
        this.f25867e = i7;
        this.f25868f = arrayList;
    }
}
