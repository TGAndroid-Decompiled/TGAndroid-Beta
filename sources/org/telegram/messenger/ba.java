package org.telegram.messenger;

import java.util.ArrayList;
public final class ba implements Runnable {
    public final int f19825a;
    public final MessagesController f19826b;
    public final ArrayList f19827c;

    public ba(MessagesController messagesController, ArrayList arrayList, int i9) {
        this.f19825a = i9;
        this.f19826b = messagesController;
        this.f19827c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19825a) {
            case 0:
                MessagesController.t1(this.f19826b, this.f19827c);
                return;
            case 1:
                MessagesController.s2(this.f19826b, this.f19827c);
                return;
            case 2:
                MessagesController.A2(this.f19826b, this.f19827c);
                return;
            case 3:
                MessagesController.K4(this.f19826b, this.f19827c);
                return;
            case 4:
                MessagesController.P3(this.f19826b, this.f19827c);
                return;
            case 5:
                MessagesController.b5(this.f19826b, this.f19827c);
                return;
            case 6:
                MessagesController.d0(this.f19826b, this.f19827c);
                return;
            default:
                MessagesController.R2(this.f19826b, this.f19827c);
                return;
        }
    }
}
