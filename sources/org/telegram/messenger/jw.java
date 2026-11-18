package org.telegram.messenger;

import java.util.ArrayList;
public final class jw implements Runnable {
    public final int f24929a;
    public final zy f24930b;
    public final long f24931c;
    public final ArrayList d;

    public jw(zy zyVar, long j3, ArrayList arrayList, int i7) {
        this.f24929a = i7;
        this.f24930b = zyVar;
        this.f24931c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24929a) {
            case 0:
                this.f24930b.getMessagesController().s3(this.d, this.f24931c);
                return;
            case 1:
                this.f24930b.getMessagesController().s3(this.d, this.f24931c);
                return;
            default:
                this.f24930b.getMessagesController().s3(this.d, this.f24931c);
                return;
        }
    }
}
