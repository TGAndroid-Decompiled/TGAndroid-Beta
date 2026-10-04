package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f17321a;
    public final MessagesController f17322b;
    public final long f17323c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f17321a = i10;
        this.f17322b = messagesController;
        this.f17323c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17321a) {
            case 0:
                MessagesController.f7(this.f17323c, this.d, this.f17322b);
                return;
            case 1:
                MessagesController.U0(this.f17323c, this.d, this.f17322b);
                return;
            case 2:
                MessagesController.t0(this.f17323c, this.d, this.f17322b);
                return;
            case 3:
                MessagesController.S1(this.f17323c, this.d, this.f17322b);
                return;
            case 4:
                MessagesController.J4(this.f17323c, this.d, this.f17322b);
                return;
            default:
                MessagesController.s4(this.f17323c, this.d, this.f17322b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f17321a = i10;
        this.f17322b = messagesController;
        this.d = arrayList;
        this.f17323c = j3;
    }
}
