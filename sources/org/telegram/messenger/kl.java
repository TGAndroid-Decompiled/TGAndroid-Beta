package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kl implements Runnable {
    public final int f23838a;
    public final hp f23839b;
    public final long f23840c;
    public final long d;
    public final int f23841e;
    public final ArrayList f23842f;

    public kl(hp hpVar, long j10, int i3, long j11, ArrayList arrayList, int i10) {
        this.f23838a = i10;
        this.f23839b = hpVar;
        this.f23840c = j10;
        this.f23841e = i3;
        this.d = j11;
        this.f23842f = arrayList;
    }

    @Override
    public final void run() {
        int i3 = this.f23838a;
        ArrayList arrayList = this.f23842f;
        hp hpVar = this.f23839b;
        switch (i3) {
            case 0:
                long j10 = this.f23840c;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                long j11 = this.d;
                int i11 = this.f23841e;
                if (i10 == 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) hpVar.R.f(j11);
                    if (dialog == null) {
                        hpVar.getMessagesStorage().Q1(j11, i11, true, false);
                        return;
                    }
                    int i12 = dialog.unread_poll_votes_count + i11;
                    dialog.unread_poll_votes_count = i12;
                    if (i12 < 0) {
                        dialog.unread_poll_votes_count = 0;
                    }
                    hpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j11, 0L, false);
                    hpVar.getNotificationCenter().k(302, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = hpVar.getMessagesController().f23102q7.B(i11, j11, j10, true);
                if (B >= 0) {
                    hpVar.getMessagesStorage().h2(B, j11, j10, true);
                    hpVar.getNotificationCenter().k(302, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j12 = this.f23840c;
                int i13 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                long j13 = this.d;
                int i14 = this.f23841e;
                if (i13 == 0) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar.R.f(j13);
                    if (dialog2 == null) {
                        hpVar.getMessagesStorage().Q1(j13, i14, true, true);
                        return;
                    }
                    int i15 = dialog2.unread_reactions_count + i14;
                    dialog2.unread_reactions_count = i15;
                    if (i15 < 0) {
                        dialog2.unread_reactions_count = 0;
                    }
                    hpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j13, 0L, false);
                    if (hpVar.t2(j13) || hpVar.y2(j13) || j13 > 0) {
                        hpVar.getNotificationCenter().k(301, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = hpVar.getMessagesController().f23102q7.C(i14, j13, j12, true);
                if (C >= 0) {
                    hpVar.getMessagesStorage().i2(C, j13, j12, true);
                    if (hpVar.t2(j13) || hpVar.y2(j13) || j13 > 0) {
                        hpVar.getNotificationCenter().k(301, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a0.h hVar = hpVar.R;
                long j14 = this.f23840c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j14);
                int i16 = this.f23841e;
                if (dialog3 == null) {
                    hpVar.getMessagesStorage().Q1(j14, i16, false, false);
                    return;
                }
                dialog3.unread_poll_votes_count = i16;
                qr messagesStorage = hpVar.getMessagesStorage();
                long j15 = this.d;
                messagesStorage.h2(i16, j14, j15, false);
                hpVar.getNotificationCenter().k(302, Long.valueOf(j14), Long.valueOf(j15), Integer.valueOf(i16), arrayList);
                return;
            case 3:
                a0.h hVar2 = hpVar.R;
                long j16 = this.f23840c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j16);
                int i17 = this.f23841e;
                if (dialog4 == null) {
                    hpVar.getMessagesStorage().Q1(j16, i17, false, true);
                    return;
                }
                dialog4.unread_reactions_count = i17;
                qr messagesStorage2 = hpVar.getMessagesStorage();
                long j17 = this.d;
                messagesStorage2.i2(i17, j16, j17, false);
                hpVar.getNotificationCenter().k(301, Long.valueOf(j16), Long.valueOf(j17), Integer.valueOf(i17), arrayList);
                return;
            case 4:
                c00 c00Var = hpVar.getMessagesController().f23102q7;
                int i18 = this.f23841e;
                long j18 = this.f23840c;
                long j19 = this.d;
                c00Var.B(i18, j18, j19, false);
                hpVar.getMessagesStorage().h2(i18, j18, j19, false);
                hpVar.getNotificationCenter().k(302, Long.valueOf(j18), Long.valueOf(j19), Integer.valueOf(i18), arrayList);
                return;
            case 5:
                c00 c00Var2 = hpVar.getMessagesController().f23102q7;
                int i19 = this.f23841e;
                long j20 = this.f23840c;
                long j21 = this.d;
                c00Var2.C(i19, j20, j21, false);
                hpVar.getMessagesStorage().i2(i19, j20, j21, false);
                hpVar.getNotificationCenter().k(301, Long.valueOf(j20), Long.valueOf(j21), Integer.valueOf(i19), arrayList);
                return;
            default:
                c00 c00Var3 = hpVar.getMessagesController().f23102q7;
                int i20 = this.f23841e;
                long j22 = this.f23840c;
                long j23 = this.d;
                c00Var3.C(i20, j22, j23, false);
                hpVar.getMessagesStorage().i2(i20, j22, j23, false);
                hpVar.getNotificationCenter().k(301, Long.valueOf(j22), Long.valueOf(j23), Integer.valueOf(i20), arrayList);
                return;
        }
    }

    public kl(hp hpVar, long j10, long j11, int i3, ArrayList arrayList, int i10) {
        this.f23838a = i10;
        this.f23839b = hpVar;
        this.f23840c = j10;
        this.d = j11;
        this.f23841e = i3;
        this.f23842f = arrayList;
    }
}
