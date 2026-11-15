package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f26311a;
    public final np f26312b;
    public final long f26313c;
    public final long d;
    public final int f26314e;
    public final ArrayList f26315f;

    public rl(np npVar, long j3, int i7, long j10, ArrayList arrayList, int i10) {
        this.f26311a = i10;
        this.f26312b = npVar;
        this.f26313c = j3;
        this.f26314e = i7;
        this.d = j10;
        this.f26315f = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f26311a;
        ArrayList arrayList = this.f26315f;
        np npVar = this.f26312b;
        switch (i7) {
            case 0:
                long j3 = this.f26313c;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                long j10 = this.d;
                int i11 = this.f26314e;
                if (i10 == 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) npVar.R.f(j10);
                    if (dialog == null) {
                        npVar.getMessagesStorage().Q1(j10, i11, true, false);
                        return;
                    }
                    int i12 = dialog.unread_poll_votes_count + i11;
                    dialog.unread_poll_votes_count = i12;
                    if (i12 < 0) {
                        dialog.unread_poll_votes_count = 0;
                    }
                    npVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j10, 0L, false);
                    npVar.getNotificationCenter().k(302, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = npVar.getMessagesController().f25386r7.B(i11, j10, j3, true);
                if (B >= 0) {
                    npVar.getMessagesStorage().h2(B, j10, j3, true);
                    npVar.getNotificationCenter().k(302, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j11 = this.f26313c;
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                long j12 = this.d;
                int i14 = this.f26314e;
                if (i13 == 0) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar.R.f(j12);
                    if (dialog2 == null) {
                        npVar.getMessagesStorage().Q1(j12, i14, true, true);
                        return;
                    }
                    int i15 = dialog2.unread_reactions_count + i14;
                    dialog2.unread_reactions_count = i15;
                    if (i15 < 0) {
                        dialog2.unread_reactions_count = 0;
                    }
                    npVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j12, 0L, false);
                    if (npVar.t2(j12) || npVar.y2(j12) || j12 > 0) {
                        npVar.getNotificationCenter().k(301, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = npVar.getMessagesController().f25386r7.C(i14, j12, j11, true);
                if (C >= 0) {
                    npVar.getMessagesStorage().i2(C, j12, j11, true);
                    if (npVar.t2(j12) || npVar.y2(j12) || j12 > 0) {
                        npVar.getNotificationCenter().k(301, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a0.h hVar = npVar.R;
                long j13 = this.f26313c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j13);
                int i16 = this.f26314e;
                if (dialog3 == null) {
                    npVar.getMessagesStorage().Q1(j13, i16, false, false);
                    return;
                }
                dialog3.unread_poll_votes_count = i16;
                vr messagesStorage = npVar.getMessagesStorage();
                long j14 = this.d;
                messagesStorage.h2(i16, j13, j14, false);
                npVar.getNotificationCenter().k(302, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i16), arrayList);
                return;
            case 3:
                a0.h hVar2 = npVar.R;
                long j15 = this.f26313c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j15);
                int i17 = this.f26314e;
                if (dialog4 == null) {
                    npVar.getMessagesStorage().Q1(j15, i17, false, true);
                    return;
                }
                dialog4.unread_reactions_count = i17;
                vr messagesStorage2 = npVar.getMessagesStorage();
                long j16 = this.d;
                messagesStorage2.i2(i17, j15, j16, false);
                npVar.getNotificationCenter().k(301, Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i17), arrayList);
                return;
            case 4:
                h00 h00Var = npVar.getMessagesController().f25386r7;
                int i18 = this.f26314e;
                long j17 = this.f26313c;
                long j18 = this.d;
                h00Var.B(i18, j17, j18, false);
                npVar.getMessagesStorage().h2(i18, j17, j18, false);
                npVar.getNotificationCenter().k(302, Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(i18), arrayList);
                return;
            case 5:
                h00 h00Var2 = npVar.getMessagesController().f25386r7;
                int i19 = this.f26314e;
                long j19 = this.f26313c;
                long j20 = this.d;
                h00Var2.C(i19, j19, j20, false);
                npVar.getMessagesStorage().i2(i19, j19, j20, false);
                npVar.getNotificationCenter().k(301, Long.valueOf(j19), Long.valueOf(j20), Integer.valueOf(i19), arrayList);
                return;
            default:
                h00 h00Var3 = npVar.getMessagesController().f25386r7;
                int i20 = this.f26314e;
                long j21 = this.f26313c;
                long j22 = this.d;
                h00Var3.C(i20, j21, j22, false);
                npVar.getMessagesStorage().i2(i20, j21, j22, false);
                npVar.getNotificationCenter().k(301, Long.valueOf(j21), Long.valueOf(j22), Integer.valueOf(i20), arrayList);
                return;
        }
    }

    public rl(np npVar, long j3, long j10, int i7, ArrayList arrayList, int i10) {
        this.f26311a = i10;
        this.f26312b = npVar;
        this.f26313c = j3;
        this.d = j10;
        this.f26314e = i7;
        this.f26315f = arrayList;
    }
}
