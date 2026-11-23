package org.telegram.messenger;

import java.util.ArrayList;
public final class kw implements Runnable {
    public final int f25141a;
    public final az f25142b;
    public final long f25143c;
    public final ArrayList d;

    public kw(az azVar, long j3, ArrayList arrayList, int i7) {
        this.f25141a = i7;
        this.f25142b = azVar;
        this.f25143c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25141a) {
            case 0:
                this.f25142b.getMessagesController().s3(this.d, this.f25143c);
                return;
            case 1:
                this.f25142b.getMessagesController().s3(this.d, this.f25143c);
                return;
            default:
                this.f25142b.getMessagesController().s3(this.d, this.f25143c);
                return;
        }
    }
}
