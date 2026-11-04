package org.telegram.messenger;

import java.util.ArrayList;
public final class xj implements Runnable {
    public final int f26393a = 2;
    public final hp f26394b;
    public final ArrayList f26395c;
    public final long d;
    public final long f26396e;

    public xj(hp hpVar, long j10, long j11, ArrayList arrayList) {
        this.f26394b = hpVar;
        this.d = j10;
        this.f26396e = j11;
        this.f26395c = arrayList;
    }

    @Override
    public final void run() {
        int i3 = this.f26393a;
        hp hpVar = this.f26394b;
        switch (i3) {
            case 0:
                long j10 = this.d;
                ArrayList arrayList = this.f26395c;
                hpVar.getMessagesStorage().R1(j10, -j10, arrayList, hpVar.getMessagesStorage().P0(j10, arrayList, false, true, 5, (int) this.f26396e));
                return;
            case 1:
                hp hpVar2 = this.f26394b;
                ArrayList arrayList2 = this.f26395c;
                long j11 = this.d;
                g0.h3(new wj(hpVar2, arrayList2, j11, 1));
                qr messagesStorage = hpVar2.getMessagesStorage();
                long j12 = this.f26396e;
                messagesStorage.E(arrayList2, j12);
                hpVar2.getMessagesStorage().R1(j12, j11, arrayList2, hpVar2.getMessagesStorage().P0(j12, arrayList2, false, true, 0, 0));
                return;
            default:
                c00 c00Var = hpVar.getMessagesController().f23102q7;
                long j13 = this.d;
                long j14 = this.f26396e;
                c00Var.B(0, j13, j14, false);
                hpVar.getMessagesStorage().h2(0, j13, j14, false);
                hpVar.getNotificationCenter().k(302, Long.valueOf(j13), Long.valueOf(j14), 0, this.f26395c);
                return;
        }
    }

    public xj(hp hpVar, long j10, ArrayList arrayList, long j11) {
        this.f26394b = hpVar;
        this.d = j10;
        this.f26395c = arrayList;
        this.f26396e = j11;
    }

    public xj(hp hpVar, ArrayList arrayList, long j10, long j11) {
        this.f26394b = hpVar;
        this.f26395c = arrayList;
        this.d = j10;
        this.f26396e = j11;
    }
}
