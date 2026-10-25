package org.telegram.messenger;

import java.util.ArrayList;
public final class ca implements Runnable {
    public final int f19773a;
    public final MessagesController f19774b;
    public final ArrayList f19775c;
    public final long d;

    public ca(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f19773a = i10;
        this.f19774b = messagesController;
        this.d = j10;
        this.f19775c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19773a) {
            case 0:
                MessagesController.m7(this.d, this.f19775c, this.f19774b);
                return;
            case 1:
                MessagesController.D0(this.d, this.f19775c, this.f19774b);
                return;
            case 2:
                MessagesController.u8(this.d, this.f19775c, this.f19774b);
                return;
            case 3:
                MessagesController.o6(this.d, this.f19775c, this.f19774b);
                return;
            case 4:
                MessagesController.I2(this.d, this.f19775c, this.f19774b);
                return;
            default:
                MessagesController.A4(this.d, this.f19775c, this.f19774b);
                return;
        }
    }

    public ca(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f19773a = i10;
        this.f19774b = messagesController;
        this.f19775c = arrayList;
        this.d = j10;
    }
}
