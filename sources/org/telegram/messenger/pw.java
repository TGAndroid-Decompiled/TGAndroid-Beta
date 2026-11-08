package org.telegram.messenger;

import java.util.ArrayList;
public final class pw implements Runnable {
    public final int f24626a;
    public final gz f24627b;
    public final long f24628c;
    public final ArrayList d;

    public pw(gz gzVar, long j3, ArrayList arrayList, int i7) {
        this.f24626a = i7;
        this.f24627b = gzVar;
        this.f24628c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24626a) {
            case 0:
                this.f24627b.getMessagesController().l3(this.d, this.f24628c);
                return;
            case 1:
                this.f24627b.getMessagesController().l3(this.d, this.f24628c);
                return;
            default:
                this.f24627b.getMessagesController().l3(this.d, this.f24628c);
                return;
        }
    }
}
