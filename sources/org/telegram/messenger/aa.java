package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f15890a;
    public final MessagesController f15891b;
    public final long f15892c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15890a = i10;
        this.f15891b = messagesController;
        this.f15892c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15890a) {
            case 0:
                MessagesController.f7(this.f15892c, this.d, this.f15891b);
                return;
            case 1:
                MessagesController.U0(this.f15892c, this.d, this.f15891b);
                return;
            case 2:
                MessagesController.t0(this.f15892c, this.d, this.f15891b);
                return;
            case 3:
                MessagesController.S1(this.f15892c, this.d, this.f15891b);
                return;
            case 4:
                MessagesController.J4(this.f15892c, this.d, this.f15891b);
                return;
            default:
                MessagesController.s4(this.f15892c, this.d, this.f15891b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15890a = i10;
        this.f15891b = messagesController;
        this.d = arrayList;
        this.f15892c = j3;
    }
}
