package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d97 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayList f;

    public d97(oc7 oc7Var, long j, int i, long j2, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                long j = this.c;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                long j2 = this.d;
                int i2 = this.e;
                if (i == 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) oc7Var.R.f(j2);
                    if (dialog == null) {
                        oc7Var.getMessagesStorage().N1(j2, i2, true, false);
                        return;
                    }
                    int i3 = dialog.unread_poll_votes_count + i2;
                    dialog.unread_poll_votes_count = i3;
                    if (i3 < 0) {
                        dialog.unread_poll_votes_count = 0;
                    }
                    oc7Var.getMessagesStorage().e2(dialog.unread_poll_votes_count, j2, 0L, false);
                    oc7Var.getNotificationCenter().k(307, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = oc7Var.getMessagesController().g4.B(i2, j2, j, true);
                if (B >= 0) {
                    oc7Var.getMessagesStorage().e2(B, j2, j, true);
                    oc7Var.getNotificationCenter().k(307, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j3 = this.c;
                int i4 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                long j4 = this.d;
                int i5 = this.e;
                if (i4 == 0) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) oc7Var.R.f(j4);
                    if (dialog2 == null) {
                        oc7Var.getMessagesStorage().N1(j4, i5, true, true);
                        return;
                    }
                    int i6 = dialog2.unread_reactions_count + i5;
                    dialog2.unread_reactions_count = i6;
                    if (i6 < 0) {
                        dialog2.unread_reactions_count = 0;
                    }
                    oc7Var.getMessagesStorage().f2(dialog2.unread_reactions_count, j4, 0L, false);
                    if (oc7Var.s2(j4) || oc7Var.y2(j4) || j4 > 0) {
                        oc7Var.getNotificationCenter().k(306, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = oc7Var.getMessagesController().g4.C(i5, j4, j3, true);
                if (C >= 0) {
                    oc7Var.getMessagesStorage().f2(C, j4, j3, true);
                    if (oc7Var.s2(j4) || oc7Var.y2(j4) || j4 > 0) {
                        oc7Var.getNotificationCenter().k(306, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vh6 vh6Var = oc7Var.R;
                long j5 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var.f(j5);
                int i7 = this.e;
                if (dialog3 == null) {
                    oc7Var.getMessagesStorage().N1(j5, i7, false, false);
                    return;
                }
                dialog3.unread_poll_votes_count = i7;
                cf7 messagesStorage = oc7Var.getMessagesStorage();
                long j6 = this.d;
                messagesStorage.e2(i7, j5, j6, false);
                oc7Var.getNotificationCenter().k(307, Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i7), arrayList);
                return;
            case 3:
                qwb qwbVar = oc7Var.getMessagesController().g4;
                int i8 = this.e;
                long j7 = this.c;
                long j8 = this.d;
                qwbVar.C(i8, j7, j8, false);
                oc7Var.getMessagesStorage().f2(i8, j7, j8, false);
                oc7Var.getNotificationCenter().k(306, Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i8), arrayList);
                return;
            case 4:
                qwb qwbVar2 = oc7Var.getMessagesController().g4;
                int i9 = this.e;
                long j9 = this.c;
                long j10 = this.d;
                qwbVar2.C(i9, j9, j10, false);
                oc7Var.getMessagesStorage().f2(i9, j9, j10, false);
                oc7Var.getNotificationCenter().k(306, Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i9), arrayList);
                return;
            case 5:
                vh6 vh6Var2 = oc7Var.R;
                long j11 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) vh6Var2.f(j11);
                int i10 = this.e;
                if (dialog4 == null) {
                    oc7Var.getMessagesStorage().N1(j11, i10, false, true);
                    return;
                }
                dialog4.unread_reactions_count = i10;
                cf7 messagesStorage2 = oc7Var.getMessagesStorage();
                long j12 = this.d;
                messagesStorage2.f2(i10, j11, j12, false);
                oc7Var.getNotificationCenter().k(306, Long.valueOf(j11), Long.valueOf(j12), Integer.valueOf(i10), arrayList);
                return;
            default:
                qwb qwbVar3 = oc7Var.getMessagesController().g4;
                int i11 = this.e;
                long j13 = this.c;
                long j14 = this.d;
                qwbVar3.B(i11, j13, j14, false);
                oc7Var.getMessagesStorage().e2(i11, j13, j14, false);
                oc7Var.getNotificationCenter().k(307, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i11), arrayList);
                return;
        }
    }

    public d97(oc7 oc7Var, long j, long j2, int i, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = arrayList;
    }
}
