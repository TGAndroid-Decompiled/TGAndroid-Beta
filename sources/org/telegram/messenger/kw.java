package org.telegram.messenger;

import java.util.ArrayList;
public final class kw implements Runnable {
    public final int f25105a;
    public final az f25106b;
    public final long f25107c;
    public final ArrayList d;

    public kw(az azVar, long j3, ArrayList arrayList, int i7) {
        this.f25105a = i7;
        this.f25106b = azVar;
        this.f25107c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25105a) {
            case 0:
                this.f25106b.getMessagesController().s3(this.d, this.f25107c);
                return;
            case 1:
                this.f25106b.getMessagesController().s3(this.d, this.f25107c);
                return;
            default:
                this.f25106b.getMessagesController().s3(this.d, this.f25107c);
                return;
        }
    }
}
