package org.telegram.messenger;

import java.util.ArrayList;
public final class dk implements Runnable {
    public final int f23567a = 2;
    public final mp f23568b;
    public final ArrayList f23569c;
    public final long d;
    public final long f23570e;

    public dk(mp mpVar, long j3, long j10, ArrayList arrayList) {
        this.f23568b = mpVar;
        this.d = j3;
        this.f23570e = j10;
        this.f23569c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f23567a;
        mp mpVar = this.f23568b;
        switch (i7) {
            case 0:
                long j3 = this.d;
                ArrayList arrayList = this.f23569c;
                mpVar.getMessagesStorage().R1(j3, -j3, arrayList, mpVar.getMessagesStorage().P0(j3, arrayList, false, true, 5, (int) this.f23570e));
                return;
            case 1:
                mp mpVar2 = this.f23568b;
                ArrayList arrayList2 = this.f23569c;
                long j10 = this.d;
                g0.g3(new ck(mpVar2, arrayList2, j10, 1));
                tr messagesStorage = mpVar2.getMessagesStorage();
                long j11 = this.f23570e;
                messagesStorage.E(arrayList2, j11);
                mpVar2.getMessagesStorage().R1(j11, j10, arrayList2, mpVar2.getMessagesStorage().P0(j11, arrayList2, false, true, 0, 0));
                return;
            default:
                e00 e00Var = mpVar.getMessagesController().f25797t7;
                long j12 = this.d;
                long j13 = this.f23570e;
                e00Var.B(0, j12, j13, false);
                mpVar.getMessagesStorage().h2(0, j12, j13, false);
                mpVar.getNotificationCenter().k(305, Long.valueOf(j12), Long.valueOf(j13), 0, this.f23569c);
                return;
        }
    }

    public dk(mp mpVar, long j3, ArrayList arrayList, long j10) {
        this.f23568b = mpVar;
        this.d = j3;
        this.f23569c = arrayList;
        this.f23570e = j10;
    }

    public dk(mp mpVar, ArrayList arrayList, long j3, long j10) {
        this.f23568b = mpVar;
        this.f23569c = arrayList;
        this.d = j3;
        this.f23570e = j10;
    }
}
