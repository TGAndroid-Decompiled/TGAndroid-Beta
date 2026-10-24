package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ve implements Runnable {
    public final int f19835a;
    public final MessagesStorage.IntCallback f19836b;
    public final int f19837c;

    public ve(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19835a = i11;
        this.f19836b = intCallback;
        this.f19837c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19835a) {
            case 0:
                this.f19836b.run(this.f19837c);
                return;
            case 1:
                this.f19836b.run(this.f19837c);
                return;
            default:
                this.f19836b.run(this.f19837c);
                return;
        }
    }
}
