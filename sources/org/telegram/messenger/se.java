package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f17538a;
    public final MessagesStorage.IntCallback f17539b;
    public final int f17540c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17538a = i11;
        this.f17539b = intCallback;
        this.f17540c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17538a) {
            case 0:
                this.f17539b.run(this.f17540c);
                return;
            case 1:
                this.f17539b.run(this.f17540c);
                return;
            default:
                this.f17539b.run(this.f17540c);
                return;
        }
    }
}
