package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f17529a;
    public final MessagesStorage.IntCallback f17530b;
    public final int f17531c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17529a = i11;
        this.f17530b = intCallback;
        this.f17531c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17529a) {
            case 0:
                this.f17530b.run(this.f17531c);
                return;
            case 1:
                this.f17530b.run(this.f17531c);
                return;
            default:
                this.f17530b.run(this.f17531c);
                return;
        }
    }
}
