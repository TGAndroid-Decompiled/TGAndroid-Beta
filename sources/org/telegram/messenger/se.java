package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19198a;
    public final MessagesStorage.IntCallback f19199b;
    public final int f19200c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19198a = i11;
        this.f19199b = intCallback;
        this.f19200c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19198a) {
            case 0:
                this.f19199b.run(this.f19200c);
                return;
            case 1:
                this.f19199b.run(this.f19200c);
                return;
            default:
                this.f19199b.run(this.f19200c);
                return;
        }
    }
}
