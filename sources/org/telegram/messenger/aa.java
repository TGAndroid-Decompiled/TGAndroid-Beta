package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f15889a;
    public final MessagesController f15890b;
    public final long f15891c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15889a = i10;
        this.f15890b = messagesController;
        this.f15891c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15889a) {
            case 0:
                MessagesController.f7(this.f15891c, this.d, this.f15890b);
                return;
            case 1:
                MessagesController.U0(this.f15891c, this.d, this.f15890b);
                return;
            case 2:
                MessagesController.t0(this.f15891c, this.d, this.f15890b);
                return;
            case 3:
                MessagesController.S1(this.f15891c, this.d, this.f15890b);
                return;
            case 4:
                MessagesController.J4(this.f15891c, this.d, this.f15890b);
                return;
            default:
                MessagesController.s4(this.f15891c, this.d, this.f15890b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15889a = i10;
        this.f15890b = messagesController;
        this.d = arrayList;
        this.f15891c = j3;
    }
}
