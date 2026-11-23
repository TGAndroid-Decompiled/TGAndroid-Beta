package org.telegram.messenger;

import java.util.ArrayList;
public final class ek implements Runnable {
    public final int f23691a = 2;
    public final np f23692b;
    public final ArrayList f23693c;
    public final long d;
    public final long f23694e;

    public ek(np npVar, long j3, long j10, ArrayList arrayList) {
        this.f23692b = npVar;
        this.d = j3;
        this.f23694e = j10;
        this.f23693c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f23691a;
        np npVar = this.f23692b;
        switch (i7) {
            case 0:
                long j3 = this.d;
                ArrayList arrayList = this.f23693c;
                npVar.getMessagesStorage().R1(j3, -j3, arrayList, npVar.getMessagesStorage().P0(j3, arrayList, false, true, 5, (int) this.f23694e));
                return;
            case 1:
                np npVar2 = this.f23692b;
                ArrayList arrayList2 = this.f23693c;
                long j10 = this.d;
                g0.g3(new dk(npVar2, arrayList2, j10, 1));
                ur messagesStorage = npVar2.getMessagesStorage();
                long j11 = this.f23694e;
                messagesStorage.E(arrayList2, j11);
                npVar2.getMessagesStorage().R1(j11, j10, arrayList2, npVar2.getMessagesStorage().P0(j11, arrayList2, false, true, 0, 0));
                return;
            default:
                f00 f00Var = npVar.getMessagesController().f25932t7;
                long j12 = this.d;
                long j13 = this.f23694e;
                f00Var.B(0, j12, j13, false);
                npVar.getMessagesStorage().h2(0, j12, j13, false);
                npVar.getNotificationCenter().k(305, Long.valueOf(j12), Long.valueOf(j13), 0, this.f23693c);
                return;
        }
    }

    public ek(np npVar, long j3, ArrayList arrayList, long j10) {
        this.f23692b = npVar;
        this.d = j3;
        this.f23693c = arrayList;
        this.f23694e = j10;
    }

    public ek(np npVar, ArrayList arrayList, long j3, long j10) {
        this.f23692b = npVar;
        this.f23693c = arrayList;
        this.d = j3;
        this.f23694e = j10;
    }
}
