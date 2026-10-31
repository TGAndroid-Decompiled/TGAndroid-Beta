package org.telegram.messenger;

import java.util.ArrayList;
public final class cx implements Runnable {
    public final int f15094a;
    public final qz f15095b;
    public final long f15096c;
    public final ArrayList d;

    public cx(qz qzVar, long j10, ArrayList arrayList, int i10) {
        this.f15094a = i10;
        this.f15095b = qzVar;
        this.f15096c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15094a) {
            case 0:
                this.f15095b.getMessagesController().j3(this.d, this.f15096c);
                return;
            case 1:
                this.f15095b.getMessagesController().j3(this.d, this.f15096c);
                return;
            default:
                this.f15095b.getMessagesController().j3(this.d, this.f15096c);
                return;
        }
    }
}
