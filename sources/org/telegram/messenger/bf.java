package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class bf implements Runnable {
    public final int f19855a;
    public final MessagesStorage f19856b;
    public final long f19857c;
    public final MessagesStorage.IntCallback d;

    public bf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i9) {
        this.f19855a = i9;
        this.f19856b = messagesStorage;
        this.f19857c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f19855a) {
            case 0:
                MessagesStorage.E2(this.f19856b, this.f19857c, this.d);
                return;
            case 1:
                MessagesStorage.k2(this.f19856b, this.f19857c, this.d);
                return;
            case 2:
                MessagesStorage.l2(this.f19856b, this.f19857c, this.d);
                return;
            default:
                MessagesStorage.h0(this.f19856b, this.f19857c, this.d);
                return;
        }
    }
}
