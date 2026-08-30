package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class xe implements Runnable {
    public final int f18983a;
    public final MessagesStorage.IntCallback f18984b;
    public final int f18985c;

    public xe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f18983a = i11;
        this.f18984b = intCallback;
        this.f18985c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18983a) {
            case 0:
                this.f18984b.run(this.f18985c);
                return;
            case 1:
                this.f18984b.run(this.f18985c);
                return;
            default:
                this.f18984b.run(this.f18985c);
                return;
        }
    }
}
