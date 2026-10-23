package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f17923a;
    public final MessagesController f17924b;
    public final ArrayList f17925c;
    public final long d;

    public aa(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f17923a = i10;
        this.f17924b = messagesController;
        this.d = j10;
        this.f17925c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17923a) {
            case 0:
                MessagesController.n8(this.d, this.f17925c, this.f17924b);
                return;
            case 1:
                MessagesController.h7(this.d, this.f17925c, this.f17924b);
                return;
            case 2:
                MessagesController.k3(this.d, this.f17925c, this.f17924b);
                return;
            case 3:
                MessagesController.y1(this.d, this.f17925c, this.f17924b);
                return;
            case 4:
                MessagesController.h3(this.d, this.f17925c, this.f17924b);
                return;
            default:
                MessagesController.J0(this.d, this.f17925c, this.f17924b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f17923a = i10;
        this.f17924b = messagesController;
        this.f17925c = arrayList;
        this.d = j10;
    }
}
