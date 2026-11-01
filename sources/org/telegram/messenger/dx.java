package org.telegram.messenger;

import java.util.ArrayList;
public final class dx implements Runnable {
    public final int f15450a;
    public final rz f15451b;
    public final long f15452c;
    public final ArrayList d;

    public dx(rz rzVar, long j10, ArrayList arrayList, int i10) {
        this.f15450a = i10;
        this.f15451b = rzVar;
        this.f15452c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15450a) {
            case 0:
                this.f15451b.getMessagesController().j3(this.d, this.f15452c);
                return;
            case 1:
                this.f15451b.getMessagesController().j3(this.d, this.f15452c);
                return;
            default:
                this.f15451b.getMessagesController().j3(this.d, this.f15452c);
                return;
        }
    }
}
