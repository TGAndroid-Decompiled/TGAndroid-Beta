package org.telegram.messenger;

import java.util.ArrayList;
public final class jw implements Runnable {
    public final int f25036a;
    public final zy f25037b;
    public final long f25038c;
    public final ArrayList d;

    public jw(zy zyVar, long j3, ArrayList arrayList, int i7) {
        this.f25036a = i7;
        this.f25037b = zyVar;
        this.f25038c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25036a) {
            case 0:
                this.f25037b.getMessagesController().s3(this.d, this.f25038c);
                return;
            case 1:
                this.f25037b.getMessagesController().s3(this.d, this.f25038c);
                return;
            default:
                this.f25037b.getMessagesController().s3(this.d, this.f25038c);
                return;
        }
    }
}
