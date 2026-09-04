package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class te implements Runnable {
    public final int f19080a;
    public final MessagesStorage.IntCallback f19081b;
    public final int f19082c;

    public te(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19080a = i11;
        this.f19081b = intCallback;
        this.f19082c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19080a) {
            case 0:
                this.f19081b.run(this.f19082c);
                return;
            case 1:
                this.f19081b.run(this.f19082c);
                return;
            default:
                this.f19081b.run(this.f19082c);
                return;
        }
    }
}
