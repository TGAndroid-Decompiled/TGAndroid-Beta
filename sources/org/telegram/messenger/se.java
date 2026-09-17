package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19023a;
    public final MessagesStorage.IntCallback f19024b;
    public final int f19025c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19023a = i11;
        this.f19024b = intCallback;
        this.f19025c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19023a) {
            case 0:
                this.f19024b.run(this.f19025c);
                return;
            case 1:
                this.f19024b.run(this.f19025c);
                return;
            default:
                this.f19024b.run(this.f19025c);
                return;
        }
    }
}
