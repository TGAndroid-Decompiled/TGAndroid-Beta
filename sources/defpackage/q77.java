package defpackage;

import java.util.ArrayList;
public final class q77 implements Runnable {
    public final byte a = 2;
    public final uc7 b;
    public final ArrayList c;
    public final long d;
    public final long e;

    public q77(uc7 uc7Var, long j, long j2, ArrayList arrayList) {
        this.b = uc7Var;
        this.d = j;
        this.e = j2;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                long j = this.d;
                ArrayList arrayList = this.c;
                uc7Var.getMessagesStorage().T1(j, -j, arrayList, uc7Var.getMessagesStorage().P0(j, arrayList, false, true, 5, (int) this.e));
                return;
            case 1:
                uc7 uc7Var2 = this.b;
                ArrayList arrayList2 = this.c;
                long j2 = this.d;
                hl.c3(new p77(uc7Var2, arrayList2, j2, (byte) 1));
                kf7 messagesStorage = uc7Var2.getMessagesStorage();
                long j3 = this.e;
                messagesStorage.F(arrayList2, j3);
                uc7Var2.getMessagesStorage().T1(j3, j2, arrayList2, uc7Var2.getMessagesStorage().P0(j3, arrayList2, false, true, 0, 0));
                return;
            default:
                qyb qybVar = uc7Var.getMessagesController().h4;
                long j4 = this.d;
                long j5 = this.e;
                qybVar.B(0, j4, j5, false);
                uc7Var.getMessagesStorage().j2(0, j4, j5, false);
                uc7Var.getNotificationCenter().k(306, Long.valueOf(j4), Long.valueOf(j5), 0, this.c);
                return;
        }
    }

    public q77(uc7 uc7Var, long j, ArrayList arrayList, long j2) {
        this.b = uc7Var;
        this.d = j;
        this.c = arrayList;
        this.e = j2;
    }

    public q77(uc7 uc7Var, ArrayList arrayList, long j, long j2) {
        this.b = uc7Var;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
    }
}
