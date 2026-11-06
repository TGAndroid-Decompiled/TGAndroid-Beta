package org.telegram.messenger;

import java.util.ArrayList;
public final class rw implements Runnable {
    public final int f25345a;
    public final gz f25346b;
    public final long f25347c;
    public final ArrayList d;

    public rw(gz gzVar, long j3, ArrayList arrayList, int i7) {
        this.f25345a = i7;
        this.f25346b = gzVar;
        this.f25347c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25345a) {
            case 0:
                this.f25346b.getMessagesController().l3(this.d, this.f25347c);
                return;
            case 1:
                this.f25346b.getMessagesController().l3(this.d, this.f25347c);
                return;
            default:
                this.f25346b.getMessagesController().l3(this.d, this.f25347c);
                return;
        }
    }
}
