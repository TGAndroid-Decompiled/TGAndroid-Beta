package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f17860a;
    public final MessagesController f17861b;
    public final ArrayList f17862c;
    public final long d;

    public aa(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f17860a = i10;
        this.f17861b = messagesController;
        this.d = j10;
        this.f17862c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17860a) {
            case 0:
                MessagesController.n8(this.d, this.f17862c, this.f17861b);
                return;
            case 1:
                MessagesController.h7(this.d, this.f17862c, this.f17861b);
                return;
            case 2:
                MessagesController.k3(this.d, this.f17862c, this.f17861b);
                return;
            case 3:
                MessagesController.y1(this.d, this.f17862c, this.f17861b);
                return;
            case 4:
                MessagesController.h3(this.d, this.f17862c, this.f17861b);
                return;
            default:
                MessagesController.J0(this.d, this.f17862c, this.f17861b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f17860a = i10;
        this.f17861b = messagesController;
        this.f17862c = arrayList;
        this.d = j10;
    }
}
