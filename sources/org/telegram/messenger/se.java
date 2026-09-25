package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f17535a;
    public final MessagesStorage.IntCallback f17536b;
    public final int f17537c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17535a = i11;
        this.f17536b = intCallback;
        this.f17537c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17535a) {
            case 0:
                this.f17536b.run(this.f17537c);
                return;
            case 1:
                this.f17536b.run(this.f17537c);
                return;
            default:
                this.f17536b.run(this.f17537c);
                return;
        }
    }
}
