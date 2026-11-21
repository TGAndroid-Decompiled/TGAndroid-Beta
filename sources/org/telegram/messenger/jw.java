package org.telegram.messenger;

import java.util.ArrayList;
public final class jw implements Runnable {
    public final int f24954a;
    public final zy f24955b;
    public final long f24956c;
    public final ArrayList d;

    public jw(zy zyVar, long j3, ArrayList arrayList, int i7) {
        this.f24954a = i7;
        this.f24955b = zyVar;
        this.f24956c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24954a) {
            case 0:
                this.f24955b.getMessagesController().s3(this.d, this.f24956c);
                return;
            case 1:
                this.f24955b.getMessagesController().s3(this.d, this.f24956c);
                return;
            default:
                this.f24955b.getMessagesController().s3(this.d, this.f24956c);
                return;
        }
    }
}
