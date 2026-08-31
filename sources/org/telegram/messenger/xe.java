package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class xe implements Runnable {
    public final int f20635a;
    public final MessagesStorage.IntCallback f20636b;
    public final int f20637c;

    public xe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f20635a = i11;
        this.f20636b = intCallback;
        this.f20637c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20635a) {
            case 0:
                this.f20636b.run(this.f20637c);
                return;
            case 1:
                this.f20636b.run(this.f20637c);
                return;
            default:
                this.f20636b.run(this.f20637c);
                return;
        }
    }
}
