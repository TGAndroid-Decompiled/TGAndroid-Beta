package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ue implements Runnable {
    public final int f19764a;
    public final MessagesStorage.IntCallback f19765b;
    public final int f19766c;

    public ue(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19764a = i11;
        this.f19765b = intCallback;
        this.f19766c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19764a) {
            case 0:
                this.f19765b.run(this.f19766c);
                return;
            case 1:
                this.f19765b.run(this.f19766c);
                return;
            default:
                this.f19765b.run(this.f19766c);
                return;
        }
    }
}
