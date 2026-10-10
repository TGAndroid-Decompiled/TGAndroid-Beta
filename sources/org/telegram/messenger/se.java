package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19160a;
    public final MessagesStorage.IntCallback f19161b;
    public final int f19162c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19160a = i11;
        this.f19161b = intCallback;
        this.f19162c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19160a) {
            case 0:
                this.f19161b.run(this.f19162c);
                return;
            case 1:
                this.f19161b.run(this.f19162c);
                return;
            default:
                this.f19161b.run(this.f19162c);
                return;
        }
    }
}
