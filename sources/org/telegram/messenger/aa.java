package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f17144a;
    public final MessagesController f17145b;
    public final long f17146c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f17144a = i10;
        this.f17145b = messagesController;
        this.f17146c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17144a) {
            case 0:
                MessagesController.f7(this.f17146c, this.d, this.f17145b);
                return;
            case 1:
                MessagesController.U0(this.f17146c, this.d, this.f17145b);
                return;
            case 2:
                MessagesController.t0(this.f17146c, this.d, this.f17145b);
                return;
            case 3:
                MessagesController.S1(this.f17146c, this.d, this.f17145b);
                return;
            case 4:
                MessagesController.I4(this.f17146c, this.d, this.f17145b);
                return;
            default:
                MessagesController.r4(this.f17146c, this.d, this.f17145b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f17144a = i10;
        this.f17145b = messagesController;
        this.d = arrayList;
        this.f17146c = j3;
    }
}
