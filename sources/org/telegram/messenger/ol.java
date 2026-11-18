package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ol implements Runnable {
    public final int f26066a;
    public final mp f26067b;
    public final long f26068c;
    public final long d;
    public final int f26069e;
    public final ArrayList f26070f;

    public ol(mp mpVar, long j3, int i7, long j10, ArrayList arrayList, int i10) {
        this.f26066a = i10;
        this.f26067b = mpVar;
        this.f26068c = j3;
        this.f26069e = i7;
        this.d = j10;
        this.f26070f = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f26066a;
        ArrayList arrayList = this.f26070f;
        mp mpVar = this.f26067b;
        switch (i7) {
            case 0:
                long j3 = this.f26068c;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                long j10 = this.d;
                int i11 = this.f26069e;
                if (i10 == 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) mpVar.R.f(j10);
                    if (dialog == null) {
                        mpVar.getMessagesStorage().Q1(j10, i11, true, false);
                        return;
                    }
                    int i12 = dialog.unread_poll_votes_count + i11;
                    dialog.unread_poll_votes_count = i12;
                    if (i12 < 0) {
                        dialog.unread_poll_votes_count = 0;
                    }
                    mpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j10, 0L, false);
                    mpVar.getNotificationCenter().k(305, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = mpVar.getMessagesController().f25769t7.B(i11, j10, j3, true);
                if (B >= 0) {
                    mpVar.getMessagesStorage().h2(B, j10, j3, true);
                    mpVar.getNotificationCenter().k(305, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j11 = this.f26068c;
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                long j12 = this.d;
                int i14 = this.f26069e;
                if (i13 == 0) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar.R.f(j12);
                    if (dialog2 == null) {
                        mpVar.getMessagesStorage().Q1(j12, i14, true, true);
                        return;
                    }
                    int i15 = dialog2.unread_reactions_count + i14;
                    dialog2.unread_reactions_count = i15;
                    if (i15 < 0) {
                        dialog2.unread_reactions_count = 0;
                    }
                    mpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j12, 0L, false);
                    if (mpVar.y2(j12) || mpVar.E2(j12) || j12 > 0) {
                        mpVar.getNotificationCenter().k(304, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = mpVar.getMessagesController().f25769t7.C(i14, j12, j11, true);
                if (C >= 0) {
                    mpVar.getMessagesStorage().i2(C, j12, j11, true);
                    if (mpVar.y2(j12) || mpVar.E2(j12) || j12 > 0) {
                        mpVar.getNotificationCenter().k(304, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a0.h hVar = mpVar.R;
                long j13 = this.f26068c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j13);
                int i16 = this.f26069e;
                if (dialog3 == null) {
                    mpVar.getMessagesStorage().Q1(j13, i16, false, true);
                    return;
                }
                dialog3.unread_reactions_count = i16;
                tr messagesStorage = mpVar.getMessagesStorage();
                long j14 = this.d;
                messagesStorage.i2(i16, j13, j14, false);
                mpVar.getNotificationCenter().k(304, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i16), arrayList);
                return;
            case 3:
                e00 e00Var = mpVar.getMessagesController().f25769t7;
                int i17 = this.f26069e;
                long j15 = this.f26068c;
                long j16 = this.d;
                e00Var.C(i17, j15, j16, false);
                mpVar.getMessagesStorage().i2(i17, j15, j16, false);
                mpVar.getNotificationCenter().k(304, Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i17), arrayList);
                return;
            case 4:
                a0.h hVar2 = mpVar.R;
                long j17 = this.f26068c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j17);
                int i18 = this.f26069e;
                if (dialog4 == null) {
                    mpVar.getMessagesStorage().Q1(j17, i18, false, false);
                    return;
                }
                dialog4.unread_poll_votes_count = i18;
                tr messagesStorage2 = mpVar.getMessagesStorage();
                long j18 = this.d;
                messagesStorage2.h2(i18, j17, j18, false);
                mpVar.getNotificationCenter().k(305, Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(i18), arrayList);
                return;
            case 5:
                e00 e00Var2 = mpVar.getMessagesController().f25769t7;
                int i19 = this.f26069e;
                long j19 = this.f26068c;
                long j20 = this.d;
                e00Var2.B(i19, j19, j20, false);
                mpVar.getMessagesStorage().h2(i19, j19, j20, false);
                mpVar.getNotificationCenter().k(305, Long.valueOf(j19), Long.valueOf(j20), Integer.valueOf(i19), arrayList);
                return;
            default:
                e00 e00Var3 = mpVar.getMessagesController().f25769t7;
                int i20 = this.f26069e;
                long j21 = this.f26068c;
                long j22 = this.d;
                e00Var3.C(i20, j21, j22, false);
                mpVar.getMessagesStorage().i2(i20, j21, j22, false);
                mpVar.getNotificationCenter().k(304, Long.valueOf(j21), Long.valueOf(j22), Integer.valueOf(i20), arrayList);
                return;
        }
    }

    public ol(mp mpVar, long j3, long j10, int i7, ArrayList arrayList, int i10) {
        this.f26066a = i10;
        this.f26067b = mpVar;
        this.f26068c = j3;
        this.d = j10;
        this.f26069e = i7;
        this.f26070f = arrayList;
    }
}
