package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19527a;
    public final MessagesStorage.IntCallback f19528b;
    public final int f19529c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19527a = i11;
        this.f19528b = intCallback;
        this.f19529c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19527a) {
            case 0:
                this.f19528b.run(this.f19529c);
                return;
            case 1:
                this.f19528b.run(this.f19529c);
                return;
            default:
                this.f19528b.run(this.f19529c);
                return;
        }
    }
}
