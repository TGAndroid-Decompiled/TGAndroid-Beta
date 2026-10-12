package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ve implements Runnable {
    public final int f19209a;
    public final MessagesStorage.IntCallback f19210b;
    public final int f19211c;

    public ve(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19209a = i11;
        this.f19210b = intCallback;
        this.f19211c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19209a) {
            case 0:
                this.f19210b.run(this.f19211c);
                return;
            case 1:
                this.f19210b.run(this.f19211c);
                return;
            default:
                this.f19210b.run(this.f19211c);
                return;
        }
    }
}
