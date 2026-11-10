package org.telegram.messenger;

import java.util.ArrayList;
public final class pw implements Runnable {
    public final int f24630a;
    public final gz f24631b;
    public final long f24632c;
    public final ArrayList d;

    public pw(gz gzVar, long j3, ArrayList arrayList, int i7) {
        this.f24630a = i7;
        this.f24631b = gzVar;
        this.f24632c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24630a) {
            case 0:
                this.f24631b.getMessagesController().l3(this.d, this.f24632c);
                return;
            case 1:
                this.f24631b.getMessagesController().l3(this.d, this.f24632c);
                return;
            default:
                this.f24631b.getMessagesController().l3(this.d, this.f24632c);
                return;
        }
    }
}
