package org.telegram.messenger;

import java.util.ArrayList;
public final class jw implements Runnable {
    public final int f24926a;
    public final zy f24927b;
    public final long f24928c;
    public final ArrayList d;

    public jw(zy zyVar, long j3, ArrayList arrayList, int i7) {
        this.f24926a = i7;
        this.f24927b = zyVar;
        this.f24928c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24926a) {
            case 0:
                this.f24927b.getMessagesController().s3(this.d, this.f24928c);
                return;
            case 1:
                this.f24927b.getMessagesController().s3(this.d, this.f24928c);
                return;
            default:
                this.f24927b.getMessagesController().s3(this.d, this.f24928c);
                return;
        }
    }
}
