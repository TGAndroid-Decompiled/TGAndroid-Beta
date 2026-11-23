package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pl implements Runnable {
    public final int f26276a;
    public final np f26277b;
    public final long f26278c;
    public final long d;
    public final int f26279e;
    public final ArrayList f26280f;

    public pl(np npVar, long j3, int i7, long j10, ArrayList arrayList, int i10) {
        this.f26276a = i10;
        this.f26277b = npVar;
        this.f26278c = j3;
        this.f26279e = i7;
        this.d = j10;
        this.f26280f = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f26276a;
        ArrayList arrayList = this.f26280f;
        np npVar = this.f26277b;
        switch (i7) {
            case 0:
                long j3 = this.f26278c;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                long j10 = this.d;
                int i11 = this.f26279e;
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
                    npVar.getNotificationCenter().k(305, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = npVar.getMessagesController().f25932t7.B(i11, j10, j3, true);
                if (B >= 0) {
                    npVar.getMessagesStorage().h2(B, j10, j3, true);
                    npVar.getNotificationCenter().k(305, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j11 = this.f26278c;
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                long j12 = this.d;
                int i14 = this.f26279e;
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
                    if (npVar.y2(j12) || npVar.E2(j12) || j12 > 0) {
                        npVar.getNotificationCenter().k(304, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = npVar.getMessagesController().f25932t7.C(i14, j12, j11, true);
                if (C >= 0) {
                    npVar.getMessagesStorage().i2(C, j12, j11, true);
                    if (npVar.y2(j12) || npVar.E2(j12) || j12 > 0) {
                        npVar.getNotificationCenter().k(304, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a0.h hVar = npVar.R;
                long j13 = this.f26278c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j13);
                int i16 = this.f26279e;
                if (dialog3 == null) {
                    npVar.getMessagesStorage().Q1(j13, i16, false, true);
                    return;
                }
                dialog3.unread_reactions_count = i16;
                ur messagesStorage = npVar.getMessagesStorage();
                long j14 = this.d;
                messagesStorage.i2(i16, j13, j14, false);
                npVar.getNotificationCenter().k(304, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i16), arrayList);
                return;
            case 3:
                f00 f00Var = npVar.getMessagesController().f25932t7;
                int i17 = this.f26279e;
                long j15 = this.f26278c;
                long j16 = this.d;
                f00Var.C(i17, j15, j16, false);
                npVar.getMessagesStorage().i2(i17, j15, j16, false);
                npVar.getNotificationCenter().k(304, Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i17), arrayList);
                return;
            case 4:
                a0.h hVar2 = npVar.R;
                long j17 = this.f26278c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j17);
                int i18 = this.f26279e;
                if (dialog4 == null) {
                    npVar.getMessagesStorage().Q1(j17, i18, false, false);
                    return;
                }
                dialog4.unread_poll_votes_count = i18;
                ur messagesStorage2 = npVar.getMessagesStorage();
                long j18 = this.d;
                messagesStorage2.h2(i18, j17, j18, false);
                npVar.getNotificationCenter().k(305, Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(i18), arrayList);
                return;
            case 5:
                f00 f00Var2 = npVar.getMessagesController().f25932t7;
                int i19 = this.f26279e;
                long j19 = this.f26278c;
                long j20 = this.d;
                f00Var2.B(i19, j19, j20, false);
                npVar.getMessagesStorage().h2(i19, j19, j20, false);
                npVar.getNotificationCenter().k(305, Long.valueOf(j19), Long.valueOf(j20), Integer.valueOf(i19), arrayList);
                return;
            default:
                f00 f00Var3 = npVar.getMessagesController().f25932t7;
                int i20 = this.f26279e;
                long j21 = this.f26278c;
                long j22 = this.d;
                f00Var3.C(i20, j21, j22, false);
                npVar.getMessagesStorage().i2(i20, j21, j22, false);
                npVar.getNotificationCenter().k(304, Long.valueOf(j21), Long.valueOf(j22), Integer.valueOf(i20), arrayList);
                return;
        }
    }

    public pl(np npVar, long j3, long j10, int i7, ArrayList arrayList, int i10) {
        this.f26276a = i10;
        this.f26277b = npVar;
        this.f26278c = j3;
        this.d = j10;
        this.f26279e = i7;
        this.f26280f = arrayList;
    }
}
