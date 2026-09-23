package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f15637a;
    public final MessagesController f15638b;
    public final long f15639c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15637a = i10;
        this.f15638b = messagesController;
        this.f15639c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15637a) {
            case 0:
                MessagesController.f7(this.f15639c, this.d, this.f15638b);
                return;
            case 1:
                MessagesController.U0(this.f15639c, this.d, this.f15638b);
                return;
            case 2:
                MessagesController.t0(this.f15639c, this.d, this.f15638b);
                return;
            case 3:
                MessagesController.S1(this.f15639c, this.d, this.f15638b);
                return;
            case 4:
                MessagesController.J4(this.f15639c, this.d, this.f15638b);
                return;
            default:
                MessagesController.s4(this.f15639c, this.d, this.f15638b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15637a = i10;
        this.f15638b = messagesController;
        this.d = arrayList;
        this.f15639c = j3;
    }
}
