package defpackage;

import java.util.ArrayList;
public final class n57 implements Runnable {
    public final byte a = 2;
    public final na7 b;
    public final ArrayList c;
    public final long d;
    public final long e;

    public n57(na7 na7Var, long j, long j2, ArrayList arrayList) {
        this.b = na7Var;
        this.d = j;
        this.e = j2;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                long j = this.d;
                ArrayList arrayList = this.c;
                na7Var.getMessagesStorage().O1(j, -j, arrayList, na7Var.getMessagesStorage().M0(j, arrayList, false, true, 5, (int) this.e));
                return;
            case 1:
                na7 na7Var2 = this.b;
                ArrayList arrayList2 = this.c;
                long j2 = this.d;
                gl.d3(new m57(na7Var2, arrayList2, j2, (byte) 1));
                ad7 messagesStorage = na7Var2.getMessagesStorage();
                long j3 = this.e;
                messagesStorage.D(arrayList2, j3);
                na7Var2.getMessagesStorage().O1(j3, j2, arrayList2, na7Var2.getMessagesStorage().M0(j3, arrayList2, false, true, 0, 0));
                return;
            default:
                pub pubVar = na7Var.getMessagesController().g4;
                long j4 = this.d;
                long j5 = this.e;
                pubVar.B(0, j4, j5, false);
                na7Var.getMessagesStorage().e2(0, j4, j5, false);
                na7Var.getNotificationCenter().k(305, Long.valueOf(j4), Long.valueOf(j5), 0, this.c);
                return;
        }
    }

    public n57(na7 na7Var, long j, ArrayList arrayList, long j2) {
        this.b = na7Var;
        this.d = j;
        this.c = arrayList;
        this.e = j2;
    }

    public n57(na7 na7Var, ArrayList arrayList, long j, long j2) {
        this.b = na7Var;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
    }
}
