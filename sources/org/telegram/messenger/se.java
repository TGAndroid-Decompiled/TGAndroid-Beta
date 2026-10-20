package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19530a;
    public final MessagesStorage.IntCallback f19531b;
    public final int f19532c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19530a = i11;
        this.f19531b = intCallback;
        this.f19532c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19530a) {
            case 0:
                this.f19531b.run(this.f19532c);
                return;
            case 1:
                this.f19531b.run(this.f19532c);
                return;
            default:
                this.f19531b.run(this.f19532c);
                return;
        }
    }
}
