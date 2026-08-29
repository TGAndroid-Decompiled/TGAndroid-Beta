package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ve implements Runnable {
    public final int f21822a;
    public final MessagesStorage.IntCallback f21823b;
    public final int f21824c;

    public ve(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f21822a = i11;
        this.f21823b = intCallback;
        this.f21824c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21822a) {
            case 0:
                this.f21823b.run(this.f21824c);
                return;
            case 1:
                this.f21823b.run(this.f21824c);
                return;
            default:
                this.f21823b.run(this.f21824c);
                return;
        }
    }
}
