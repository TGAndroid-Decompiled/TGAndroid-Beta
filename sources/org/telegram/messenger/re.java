package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class re implements Runnable {
    public final int f19437a;
    public final MessagesStorage.IntCallback f19438b;
    public final int f19439c;

    public re(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19437a = i11;
        this.f19438b = intCallback;
        this.f19439c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19437a) {
            case 0:
                this.f19438b.run(this.f19439c);
                return;
            case 1:
                this.f19438b.run(this.f19439c);
                return;
            default:
                this.f19438b.run(this.f19439c);
                return;
        }
    }
}
