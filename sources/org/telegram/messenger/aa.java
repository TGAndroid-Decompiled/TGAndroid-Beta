package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f17316a;
    public final MessagesController f17317b;
    public final long f17318c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f17316a = i10;
        this.f17317b = messagesController;
        this.f17318c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17316a) {
            case 0:
                MessagesController.f7(this.f17318c, this.d, this.f17317b);
                return;
            case 1:
                MessagesController.U0(this.f17318c, this.d, this.f17317b);
                return;
            case 2:
                MessagesController.t0(this.f17318c, this.d, this.f17317b);
                return;
            case 3:
                MessagesController.S1(this.f17318c, this.d, this.f17317b);
                return;
            case 4:
                MessagesController.J4(this.f17318c, this.d, this.f17317b);
                return;
            default:
                MessagesController.s4(this.f17318c, this.d, this.f17317b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f17316a = i10;
        this.f17317b = messagesController;
        this.d = arrayList;
        this.f17318c = j3;
    }
}
