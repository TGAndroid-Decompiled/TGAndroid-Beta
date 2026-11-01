package org.telegram.messenger;

import java.util.ArrayList;
public final class qk implements Runnable {
    public final int f17786a = 2;
    public final wp f17787b;
    public final ArrayList f17788c;
    public final long d;
    public final long e;

    public qk(wp wpVar, long j10, long j11, ArrayList arrayList) {
        this.f17787b = wpVar;
        this.d = j10;
        this.e = j11;
        this.f17788c = arrayList;
    }

    @Override
    public final void run() {
        int i10 = this.f17786a;
        wp wpVar = this.f17787b;
        switch (i10) {
            case 0:
                long j10 = this.d;
                ArrayList arrayList = this.f17788c;
                wpVar.getMessagesStorage().R1(j10, -j10, arrayList, wpVar.getMessagesStorage().P0(j10, arrayList, false, true, 5, (int) this.e));
                return;
            case 1:
                wp wpVar2 = this.f17787b;
                ArrayList arrayList2 = this.f17788c;
                long j11 = this.d;
                i0.g3(new pk(wpVar2, arrayList2, j11, 1));
                is messagesStorage = wpVar2.getMessagesStorage();
                long j12 = this.e;
                messagesStorage.E(arrayList2, j12);
                wpVar2.getMessagesStorage().R1(j12, j11, arrayList2, wpVar2.getMessagesStorage().P0(j12, arrayList2, false, true, 0, 0));
                return;
            default:
                y00 y00Var = wpVar.getMessagesController().f19234r7;
                long j13 = this.d;
                long j14 = this.e;
                y00Var.B(0, j13, j14, false);
                wpVar.getMessagesStorage().h2(0, j13, j14, false);
                wpVar.getNotificationCenter().k(302, Long.valueOf(j13), Long.valueOf(j14), 0, this.f17788c);
                return;
        }
    }

    public qk(wp wpVar, long j10, ArrayList arrayList, long j11) {
        this.f17787b = wpVar;
        this.d = j10;
        this.f17788c = arrayList;
        this.e = j11;
    }

    public qk(wp wpVar, ArrayList arrayList, long j10, long j11) {
        this.f17787b = wpVar;
        this.f17788c = arrayList;
        this.d = j10;
        this.e = j11;
    }
}
