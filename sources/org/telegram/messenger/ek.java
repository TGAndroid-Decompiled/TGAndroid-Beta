package org.telegram.messenger;

import java.util.ArrayList;
public final class ek implements Runnable {
    public final int f23323a = 2;
    public final np f23324b;
    public final ArrayList f23325c;
    public final long d;
    public final long f23326e;

    public ek(np npVar, long j3, long j10, ArrayList arrayList) {
        this.f23324b = npVar;
        this.d = j3;
        this.f23326e = j10;
        this.f23325c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f23323a;
        np npVar = this.f23324b;
        switch (i7) {
            case 0:
                long j3 = this.d;
                ArrayList arrayList = this.f23325c;
                npVar.getMessagesStorage().R1(j3, -j3, arrayList, npVar.getMessagesStorage().P0(j3, arrayList, false, true, 5, (int) this.f23326e));
                return;
            case 1:
                np npVar2 = this.f23324b;
                ArrayList arrayList2 = this.f23325c;
                long j10 = this.d;
                g0.h3(new dk(npVar2, arrayList2, j10, 1));
                vr messagesStorage = npVar2.getMessagesStorage();
                long j11 = this.f23326e;
                messagesStorage.E(arrayList2, j11);
                npVar2.getMessagesStorage().R1(j11, j10, arrayList2, npVar2.getMessagesStorage().P0(j11, arrayList2, false, true, 0, 0));
                return;
            default:
                h00 h00Var = npVar.getMessagesController().f25386r7;
                long j12 = this.d;
                long j13 = this.f23326e;
                h00Var.B(0, j12, j13, false);
                npVar.getMessagesStorage().h2(0, j12, j13, false);
                npVar.getNotificationCenter().k(302, Long.valueOf(j12), Long.valueOf(j13), 0, this.f23325c);
                return;
        }
    }

    public ek(np npVar, long j3, ArrayList arrayList, long j10) {
        this.f23324b = npVar;
        this.d = j3;
        this.f23325c = arrayList;
        this.f23326e = j10;
    }

    public ek(np npVar, ArrayList arrayList, long j3, long j10) {
        this.f23324b = npVar;
        this.f23325c = arrayList;
        this.d = j3;
        this.f23326e = j10;
    }
}
