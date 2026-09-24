package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f15877a;
    public final MessagesController f15878b;
    public final long f15879c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15877a = i10;
        this.f15878b = messagesController;
        this.f15879c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15877a) {
            case 0:
                MessagesController.f7(this.f15879c, this.d, this.f15878b);
                return;
            case 1:
                MessagesController.U0(this.f15879c, this.d, this.f15878b);
                return;
            case 2:
                MessagesController.t0(this.f15879c, this.d, this.f15878b);
                return;
            case 3:
                MessagesController.S1(this.f15879c, this.d, this.f15878b);
                return;
            case 4:
                MessagesController.J4(this.f15879c, this.d, this.f15878b);
                return;
            default:
                MessagesController.s4(this.f15879c, this.d, this.f15878b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15877a = i10;
        this.f15878b = messagesController;
        this.d = arrayList;
        this.f15879c = j3;
    }
}
