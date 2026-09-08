package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f17171a;
    public final MessagesController f17172b;
    public final long f17173c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f17171a = i10;
        this.f17172b = messagesController;
        this.f17173c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17171a) {
            case 0:
                MessagesController.f7(this.f17173c, this.d, this.f17172b);
                return;
            case 1:
                MessagesController.U0(this.f17173c, this.d, this.f17172b);
                return;
            case 2:
                MessagesController.t0(this.f17173c, this.d, this.f17172b);
                return;
            case 3:
                MessagesController.S1(this.f17173c, this.d, this.f17172b);
                return;
            case 4:
                MessagesController.I4(this.f17173c, this.d, this.f17172b);
                return;
            default:
                MessagesController.r4(this.f17173c, this.d, this.f17172b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f17171a = i10;
        this.f17172b = messagesController;
        this.d = arrayList;
        this.f17173c = j3;
    }
}
