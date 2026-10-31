package org.telegram.messenger;

import java.util.ArrayList;
public final class pk implements Runnable {
    public final int f17451a = 2;
    public final vp f17452b;
    public final ArrayList f17453c;
    public final long d;
    public final long e;

    public pk(vp vpVar, long j10, long j11, ArrayList arrayList) {
        this.f17452b = vpVar;
        this.d = j10;
        this.e = j11;
        this.f17453c = arrayList;
    }

    @Override
    public final void run() {
        int i10 = this.f17451a;
        vp vpVar = this.f17452b;
        switch (i10) {
            case 0:
                long j10 = this.d;
                ArrayList arrayList = this.f17453c;
                vpVar.getMessagesStorage().R1(j10, -j10, arrayList, vpVar.getMessagesStorage().P0(j10, arrayList, false, true, 5, (int) this.e));
                return;
            case 1:
                vp vpVar2 = this.f17452b;
                ArrayList arrayList2 = this.f17453c;
                long j11 = this.d;
                i0.g3(new ok(vpVar2, arrayList2, j11, 1));
                hs messagesStorage = vpVar2.getMessagesStorage();
                long j12 = this.e;
                messagesStorage.E(arrayList2, j12);
                vpVar2.getMessagesStorage().R1(j12, j11, arrayList2, vpVar2.getMessagesStorage().P0(j12, arrayList2, false, true, 0, 0));
                return;
            default:
                x00 x00Var = vpVar.getMessagesController().f18891r7;
                long j13 = this.d;
                long j14 = this.e;
                x00Var.B(0, j13, j14, false);
                vpVar.getMessagesStorage().h2(0, j13, j14, false);
                vpVar.getNotificationCenter().k(302, Long.valueOf(j13), Long.valueOf(j14), 0, this.f17453c);
                return;
        }
    }

    public pk(vp vpVar, long j10, ArrayList arrayList, long j11) {
        this.f17452b = vpVar;
        this.d = j10;
        this.f17453c = arrayList;
        this.e = j11;
    }

    public pk(vp vpVar, ArrayList arrayList, long j10, long j11) {
        this.f17452b = vpVar;
        this.f17453c = arrayList;
        this.d = j10;
        this.e = j11;
    }
}
