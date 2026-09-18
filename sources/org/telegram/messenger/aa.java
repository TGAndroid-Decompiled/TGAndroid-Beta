package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f15849a;
    public final MessagesController f15850b;
    public final long f15851c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15849a = i10;
        this.f15850b = messagesController;
        this.f15851c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15849a) {
            case 0:
                MessagesController.f7(this.f15851c, this.d, this.f15850b);
                return;
            case 1:
                MessagesController.U0(this.f15851c, this.d, this.f15850b);
                return;
            case 2:
                MessagesController.t0(this.f15851c, this.d, this.f15850b);
                return;
            case 3:
                MessagesController.S1(this.f15851c, this.d, this.f15850b);
                return;
            case 4:
                MessagesController.I4(this.f15851c, this.d, this.f15850b);
                return;
            default:
                MessagesController.r4(this.f15851c, this.d, this.f15850b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15849a = i10;
        this.f15850b = messagesController;
        this.d = arrayList;
        this.f15851c = j3;
    }
}
