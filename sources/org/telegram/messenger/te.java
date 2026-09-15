package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class te implements Runnable {
    public final int f17397a;
    public final MessagesStorage.IntCallback f17398b;
    public final int f17399c;

    public te(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17397a = i11;
        this.f17398b = intCallback;
        this.f17399c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17397a) {
            case 0:
                this.f17398b.run(this.f17399c);
                return;
            case 1:
                this.f17398b.run(this.f17399c);
                return;
            default:
                this.f17398b.run(this.f17399c);
                return;
        }
    }
}
