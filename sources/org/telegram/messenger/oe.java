package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class oe implements Runnable {
    public final int f21143a;
    public final MessagesStorage.IntCallback f21144b;
    public final int f21145c;

    public oe(MessagesStorage.IntCallback intCallback, int i9, int i10) {
        this.f21143a = i10;
        this.f21144b = intCallback;
        this.f21145c = i9;
    }

    @Override
    public final void run() {
        switch (this.f21143a) {
            case 0:
                this.f21144b.run(this.f21145c);
                return;
            case 1:
                this.f21144b.run(this.f21145c);
                return;
            default:
                this.f21144b.run(this.f21145c);
                return;
        }
    }
}
