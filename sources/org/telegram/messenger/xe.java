package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class xe implements Runnable {
    public final int f20637a;
    public final MessagesStorage.IntCallback f20638b;
    public final int f20639c;

    public xe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f20637a = i11;
        this.f20638b = intCallback;
        this.f20639c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20637a) {
            case 0:
                this.f20638b.run(this.f20639c);
                return;
            case 1:
                this.f20638b.run(this.f20639c);
                return;
            default:
                this.f20638b.run(this.f20639c);
                return;
        }
    }
}
