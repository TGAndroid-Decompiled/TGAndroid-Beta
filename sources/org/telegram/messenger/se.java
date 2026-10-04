package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19159a;
    public final MessagesStorage.IntCallback f19160b;
    public final int f19161c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19159a = i11;
        this.f19160b = intCallback;
        this.f19161c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19159a) {
            case 0:
                this.f19160b.run(this.f19161c);
                return;
            case 1:
                this.f19160b.run(this.f19161c);
                return;
            default:
                this.f19160b.run(this.f19161c);
                return;
        }
    }
}
