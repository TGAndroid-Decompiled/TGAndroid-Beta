package org.telegram.messenger;

import java.util.ArrayList;
public final class gk implements Runnable {
    public final int f22686a = 2;
    public final qp f22687b;
    public final ArrayList f22688c;
    public final long d;
    public final long f22689e;

    public gk(qp qpVar, long j3, long j10, ArrayList arrayList) {
        this.f22687b = qpVar;
        this.d = j3;
        this.f22689e = j10;
        this.f22688c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f22686a;
        qp qpVar = this.f22687b;
        switch (i7) {
            case 0:
                long j3 = this.d;
                ArrayList arrayList = this.f22688c;
                qpVar.getMessagesStorage().R1(j3, -j3, arrayList, qpVar.getMessagesStorage().P0(j3, arrayList, false, true, 5, (int) this.f22689e));
                return;
            case 1:
                qp qpVar2 = this.f22687b;
                ArrayList arrayList2 = this.f22688c;
                long j10 = this.d;
                g0.h3(new fk(qpVar2, arrayList2, j10, 1));
                yr messagesStorage = qpVar2.getMessagesStorage();
                long j11 = this.f22689e;
                messagesStorage.E(arrayList2, j11);
                qpVar2.getMessagesStorage().R1(j11, j10, arrayList2, qpVar2.getMessagesStorage().P0(j11, arrayList2, false, true, 0, 0));
                return;
            default:
                k00 k00Var = qpVar.getMessagesController().f24877q7;
                long j12 = this.d;
                long j13 = this.f22689e;
                k00Var.B(0, j12, j13, false);
                qpVar.getMessagesStorage().h2(0, j12, j13, false);
                qpVar.getNotificationCenter().k(302, Long.valueOf(j12), Long.valueOf(j13), 0, this.f22688c);
                return;
        }
    }

    public gk(qp qpVar, long j3, ArrayList arrayList, long j10) {
        this.f22687b = qpVar;
        this.d = j3;
        this.f22688c = arrayList;
        this.f22689e = j10;
    }

    public gk(qp qpVar, ArrayList arrayList, long j3, long j10) {
        this.f22687b = qpVar;
        this.f22688c = arrayList;
        this.d = j3;
        this.f22689e = j10;
    }
}
