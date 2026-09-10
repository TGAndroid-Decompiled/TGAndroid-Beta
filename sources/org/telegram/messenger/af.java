package org.telegram.messenger;

import java.util.ArrayList;
public final class af implements Runnable {
    public final int f14714a;
    public final MessagesStorage f14715b;
    public final ArrayList f14716c;
    public final long d;

    public af(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f14714a = i10;
        this.f14715b = messagesStorage;
        this.d = j3;
        this.f14716c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f14714a) {
            case 0:
                MessagesStorage.W3(this.f14715b, this.f14716c, this.d);
                return;
            case 1:
                MessagesStorage.C1(this.f14715b, this.f14716c, this.d);
                return;
            case 2:
                long j3 = this.d;
                MessagesStorage.X3(this.f14715b, this.f14716c, j3);
                return;
            case 3:
                long j10 = this.d;
                MessagesStorage.w2(this.f14715b, this.f14716c, j10);
                return;
            case 4:
                MessagesStorage.F3(this.f14715b, this.f14716c, this.d);
                return;
            case 5:
                MessagesStorage.M2(this.f14715b, this.f14716c, this.d);
                return;
            case 6:
                MessagesStorage.G3(this.f14715b, this.f14716c, this.d);
                return;
            default:
                long j11 = this.d;
                MessagesStorage.R0(this.f14715b, this.f14716c, j11);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f14714a = i10;
        this.f14715b = messagesStorage;
        this.f14716c = arrayList;
        this.d = j3;
    }
}
