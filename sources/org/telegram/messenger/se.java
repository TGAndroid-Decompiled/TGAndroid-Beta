package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f17288a;
    public final MessagesStorage.IntCallback f17289b;
    public final int f17290c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17288a = i11;
        this.f17289b = intCallback;
        this.f17290c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17288a) {
            case 0:
                this.f17289b.run(this.f17290c);
                return;
            case 1:
                this.f17289b.run(this.f17290c);
                return;
            default:
                this.f17289b.run(this.f17290c);
                return;
        }
    }
}
