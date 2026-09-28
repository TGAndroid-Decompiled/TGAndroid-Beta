package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f17539a;
    public final MessagesStorage.IntCallback f17540b;
    public final int f17541c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17539a = i11;
        this.f17540b = intCallback;
        this.f17541c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17539a) {
            case 0:
                this.f17540b.run(this.f17541c);
                return;
            case 1:
                this.f17540b.run(this.f17541c);
                return;
            default:
                this.f17540b.run(this.f17541c);
                return;
        }
    }
}
