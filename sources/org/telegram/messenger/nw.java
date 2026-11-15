package org.telegram.messenger;

import java.util.ArrayList;
public final class nw implements Runnable {
    public final int f25652a;
    public final ez f25653b;
    public final long f25654c;
    public final ArrayList d;

    public nw(ez ezVar, long j3, ArrayList arrayList, int i7) {
        this.f25652a = i7;
        this.f25653b = ezVar;
        this.f25654c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25652a) {
            case 0:
                this.f25653b.getMessagesController().l3(this.d, this.f25654c);
                return;
            case 1:
                this.f25653b.getMessagesController().l3(this.d, this.f25654c);
                return;
            default:
                this.f25653b.getMessagesController().l3(this.d, this.f25654c);
                return;
        }
    }
}
