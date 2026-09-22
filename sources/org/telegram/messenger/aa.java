package org.telegram.messenger;

import java.util.ArrayList;
public final class aa implements Runnable {
    public final int f15660a;
    public final MessagesController f15661b;
    public final long f15662c;
    public final ArrayList d;

    public aa(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15660a = i10;
        this.f15661b = messagesController;
        this.f15662c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15660a) {
            case 0:
                MessagesController.f7(this.f15662c, this.d, this.f15661b);
                return;
            case 1:
                MessagesController.U0(this.f15662c, this.d, this.f15661b);
                return;
            case 2:
                MessagesController.t0(this.f15662c, this.d, this.f15661b);
                return;
            case 3:
                MessagesController.S1(this.f15662c, this.d, this.f15661b);
                return;
            case 4:
                MessagesController.I4(this.f15662c, this.d, this.f15661b);
                return;
            default:
                MessagesController.r4(this.f15662c, this.d, this.f15661b);
                return;
        }
    }

    public aa(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15660a = i10;
        this.f15661b = messagesController;
        this.d = arrayList;
        this.f15662c = j3;
    }
}
