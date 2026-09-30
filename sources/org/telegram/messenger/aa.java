package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f15906a;
    public final MessagesController f15907b;
    public final long f15908c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15906a = i10;
        this.f15907b = messagesController;
        this.f15908c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15906a) {
            case 0:
                MessagesController.f7(this.f15908c, this.d, this.f15907b);
                return;
            case 1:
                MessagesController.U0(this.f15908c, this.d, this.f15907b);
                return;
            case 2:
                MessagesController.t0(this.f15908c, this.d, this.f15907b);
                return;
            case 3:
                MessagesController.S1(this.f15908c, this.d, this.f15907b);
                return;
            case 4:
                MessagesController.J4(this.f15908c, this.d, this.f15907b);
                return;
            default:
                MessagesController.s4(this.f15908c, this.d, this.f15907b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15906a = i10;
        this.f15907b = messagesController;
        this.d = arrayList;
        this.f15908c = j3;
    }
}
