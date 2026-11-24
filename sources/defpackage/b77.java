package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b77 implements Runnable {
    public final byte a;
    public final na7 b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayList f;

    public b77(na7 na7Var, long j, int i, long j2, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                long j = this.c;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                long j2 = this.d;
                int i2 = this.e;
                if (i == 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) na7Var.R.f(j2);
                    if (dialog == null) {
                        na7Var.getMessagesStorage().N1(j2, i2, true, false);
                        return;
                    }
                    int i3 = dialog.unread_poll_votes_count + i2;
                    dialog.unread_poll_votes_count = i3;
                    if (i3 < 0) {
                        dialog.unread_poll_votes_count = 0;
                    }
                    na7Var.getMessagesStorage().e2(dialog.unread_poll_votes_count, j2, 0L, false);
                    na7Var.getNotificationCenter().k(305, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = na7Var.getMessagesController().g4.B(i2, j2, j, true);
                if (B >= 0) {
                    na7Var.getMessagesStorage().e2(B, j2, j, true);
                    na7Var.getNotificationCenter().k(305, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j3 = this.c;
                int i4 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                long j4 = this.d;
                int i5 = this.e;
                if (i4 == 0) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7Var.R.f(j4);
                    if (dialog2 == null) {
                        na7Var.getMessagesStorage().N1(j4, i5, true, true);
                        return;
                    }
                    int i6 = dialog2.unread_reactions_count + i5;
                    dialog2.unread_reactions_count = i6;
                    if (i6 < 0) {
                        dialog2.unread_reactions_count = 0;
                    }
                    na7Var.getMessagesStorage().f2(dialog2.unread_reactions_count, j4, 0L, false);
                    if (na7Var.r2(j4) || na7Var.x2(j4) || j4 > 0) {
                        na7Var.getNotificationCenter().k(304, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = na7Var.getMessagesController().g4.C(i5, j4, j3, true);
                if (C >= 0) {
                    na7Var.getMessagesStorage().f2(C, j4, j3, true);
                    if (na7Var.r2(j4) || na7Var.x2(j4) || j4 > 0) {
                        na7Var.getNotificationCenter().k(304, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vf6 vf6Var = na7Var.R;
                long j5 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) vf6Var.f(j5);
                int i7 = this.e;
                if (dialog3 == null) {
                    na7Var.getMessagesStorage().N1(j5, i7, false, true);
                    return;
                }
                dialog3.unread_reactions_count = i7;
                ad7 messagesStorage = na7Var.getMessagesStorage();
                long j6 = this.d;
                messagesStorage.f2(i7, j5, j6, false);
                na7Var.getNotificationCenter().k(304, Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i7), arrayList);
                return;
            case 3:
                pub pubVar = na7Var.getMessagesController().g4;
                int i8 = this.e;
                long j7 = this.c;
                long j8 = this.d;
                pubVar.C(i8, j7, j8, false);
                na7Var.getMessagesStorage().f2(i8, j7, j8, false);
                na7Var.getNotificationCenter().k(304, Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i8), arrayList);
                return;
            case 4:
                vf6 vf6Var2 = na7Var.R;
                long j9 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) vf6Var2.f(j9);
                int i9 = this.e;
                if (dialog4 == null) {
                    na7Var.getMessagesStorage().N1(j9, i9, false, false);
                    return;
                }
                dialog4.unread_poll_votes_count = i9;
                ad7 messagesStorage2 = na7Var.getMessagesStorage();
                long j10 = this.d;
                messagesStorage2.e2(i9, j9, j10, false);
                na7Var.getNotificationCenter().k(305, Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i9), arrayList);
                return;
            case 5:
                pub pubVar2 = na7Var.getMessagesController().g4;
                int i10 = this.e;
                long j11 = this.c;
                long j12 = this.d;
                pubVar2.C(i10, j11, j12, false);
                na7Var.getMessagesStorage().f2(i10, j11, j12, false);
                na7Var.getNotificationCenter().k(304, Long.valueOf(j11), Long.valueOf(j12), Integer.valueOf(i10), arrayList);
                return;
            default:
                pub pubVar3 = na7Var.getMessagesController().g4;
                int i11 = this.e;
                long j13 = this.c;
                long j14 = this.d;
                pubVar3.B(i11, j13, j14, false);
                na7Var.getMessagesStorage().e2(i11, j13, j14, false);
                na7Var.getNotificationCenter().k(305, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i11), arrayList);
                return;
        }
    }

    public b77(na7 na7Var, long j, long j2, int i, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = arrayList;
    }
}
