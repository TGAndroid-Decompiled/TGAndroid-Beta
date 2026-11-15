package org.telegram.messenger;

import java.util.ArrayList;
public final class nw implements Runnable {
    public final int f25653a;
    public final ez f25654b;
    public final long f25655c;
    public final ArrayList d;

    public nw(ez ezVar, long j3, ArrayList arrayList, int i7) {
        this.f25653a = i7;
        this.f25654b = ezVar;
        this.f25655c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25653a) {
            case 0:
                this.f25654b.getMessagesController().l3(this.d, this.f25655c);
                return;
            case 1:
                this.f25654b.getMessagesController().l3(this.d, this.f25655c);
                return;
            default:
                this.f25654b.getMessagesController().l3(this.d, this.f25655c);
                return;
        }
    }
}
