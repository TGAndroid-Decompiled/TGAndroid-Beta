package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ve implements Runnable {
    public final int f18383a;
    public final MessagesStorage.IntCallback f18384b;
    public final int f18385c;

    public ve(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f18383a = i11;
        this.f18384b = intCallback;
        this.f18385c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18383a) {
            case 0:
                this.f18384b.run(this.f18385c);
                return;
            case 1:
                this.f18384b.run(this.f18385c);
                return;
            default:
                this.f18384b.run(this.f18385c);
                return;
        }
    }
}
