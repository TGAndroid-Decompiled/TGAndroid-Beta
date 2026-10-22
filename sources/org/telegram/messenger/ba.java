package org.telegram.messenger;

import java.util.ArrayList;
public final class ba implements Runnable {
    public final int f17932a;
    public final MessagesController f17933b;
    public final ArrayList f17934c;
    public final long d;

    public ba(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f17932a = i10;
        this.f17933b = messagesController;
        this.d = j10;
        this.f17934c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17932a) {
            case 0:
                MessagesController.n8(this.d, this.f17934c, this.f17933b);
                return;
            case 1:
                MessagesController.h7(this.d, this.f17934c, this.f17933b);
                return;
            case 2:
                MessagesController.k3(this.d, this.f17934c, this.f17933b);
                return;
            case 3:
                MessagesController.y1(this.d, this.f17934c, this.f17933b);
                return;
            case 4:
                MessagesController.h3(this.d, this.f17934c, this.f17933b);
                return;
            default:
                MessagesController.J0(this.d, this.f17934c, this.f17933b);
                return;
        }
    }

    public ba(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f17932a = i10;
        this.f17933b = messagesController;
        this.f17934c = arrayList;
        this.d = j10;
    }
}
