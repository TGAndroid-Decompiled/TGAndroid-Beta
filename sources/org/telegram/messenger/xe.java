package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class xe implements Runnable {
    public final int f18968a;
    public final MessagesStorage.IntCallback f18969b;
    public final int f18970c;

    public xe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f18968a = i11;
        this.f18969b = intCallback;
        this.f18970c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18968a) {
            case 0:
                this.f18969b.run(this.f18970c);
                return;
            case 1:
                this.f18969b.run(this.f18970c);
                return;
            default:
                this.f18969b.run(this.f18970c);
                return;
        }
    }
}
