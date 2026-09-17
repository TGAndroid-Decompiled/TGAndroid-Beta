package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f18996a;
    public final MessagesStorage.IntCallback f18997b;
    public final int f18998c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f18996a = i11;
        this.f18997b = intCallback;
        this.f18998c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18996a) {
            case 0:
                this.f18997b.run(this.f18998c);
                return;
            case 1:
                this.f18997b.run(this.f18998c);
                return;
            default:
                this.f18997b.run(this.f18998c);
                return;
        }
    }
}
