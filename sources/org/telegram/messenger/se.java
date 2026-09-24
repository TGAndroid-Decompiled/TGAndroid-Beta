package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f17520a;
    public final MessagesStorage.IntCallback f17521b;
    public final int f17522c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17520a = i11;
        this.f17521b = intCallback;
        this.f17522c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17520a) {
            case 0:
                this.f17521b.run(this.f17522c);
                return;
            case 1:
                this.f17521b.run(this.f17522c);
                return;
            default:
                this.f17521b.run(this.f17522c);
                return;
        }
    }
}
