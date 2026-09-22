package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class te implements Runnable {
    public final int f17393a;
    public final MessagesStorage.IntCallback f17394b;
    public final int f17395c;

    public te(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17393a = i11;
        this.f17394b = intCallback;
        this.f17395c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17393a) {
            case 0:
                this.f17394b.run(this.f17395c);
                return;
            case 1:
                this.f17394b.run(this.f17395c);
                return;
            default:
                this.f17394b.run(this.f17395c);
                return;
        }
    }
}
