package org.telegram.messenger;

import java.util.ArrayList;
public final class rw implements Runnable {
    public final int f25353a;
    public final gz f25354b;
    public final long f25355c;
    public final ArrayList d;

    public rw(gz gzVar, long j3, ArrayList arrayList, int i7) {
        this.f25353a = i7;
        this.f25354b = gzVar;
        this.f25355c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25353a) {
            case 0:
                this.f25354b.getMessagesController().l3(this.d, this.f25355c);
                return;
            case 1:
                this.f25354b.getMessagesController().l3(this.d, this.f25355c);
                return;
            default:
                this.f25354b.getMessagesController().l3(this.d, this.f25355c);
                return;
        }
    }
}
