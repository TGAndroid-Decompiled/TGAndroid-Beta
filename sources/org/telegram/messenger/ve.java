package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ve implements Runnable {
    public final int f18685a;
    public final MessagesStorage.IntCallback f18686b;
    public final int f18687c;

    public ve(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f18685a = i11;
        this.f18686b = intCallback;
        this.f18687c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18685a) {
            case 0:
                this.f18686b.run(this.f18687c);
                return;
            case 1:
                this.f18686b.run(this.f18687c);
                return;
            default:
                this.f18686b.run(this.f18687c);
                return;
        }
    }
}
