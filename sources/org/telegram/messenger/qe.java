package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class qe implements Runnable {
    public final int f19357a;
    public final MessagesStorage.IntCallback f19358b;
    public final int f19359c;

    public qe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19357a = i11;
        this.f19358b = intCallback;
        this.f19359c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19357a) {
            case 0:
                this.f19358b.run(this.f19359c);
                return;
            case 1:
                this.f19358b.run(this.f19359c);
                return;
            default:
                this.f19358b.run(this.f19359c);
                return;
        }
    }
}
