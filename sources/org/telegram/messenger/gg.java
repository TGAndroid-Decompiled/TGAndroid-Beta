package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gg implements Runnable {
    public final int f20173a;
    public final MessagesStorage.IntCallback f20174b;
    public final int f20175c;

    public gg(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f20173a = i11;
        this.f20174b = intCallback;
        this.f20175c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20173a) {
            case 0:
                this.f20174b.run(this.f20175c);
                return;
            case 1:
                this.f20174b.run(this.f20175c);
                return;
            default:
                this.f20174b.run(this.f20175c);
                return;
        }
    }
}
