package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f17555a;
    public final MessagesStorage.IntCallback f17556b;
    public final int f17557c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17555a = i11;
        this.f17556b = intCallback;
        this.f17557c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17555a) {
            case 0:
                this.f17556b.run(this.f17557c);
                return;
            case 1:
                this.f17556b.run(this.f17557c);
                return;
            default:
                this.f17556b.run(this.f17557c);
                return;
        }
    }
}
