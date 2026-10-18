package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class re implements Runnable {
    public final int f19434a;
    public final MessagesStorage.IntCallback f19435b;
    public final int f19436c;

    public re(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19434a = i11;
        this.f19435b = intCallback;
        this.f19436c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19434a) {
            case 0:
                this.f19435b.run(this.f19436c);
                return;
            case 1:
                this.f19435b.run(this.f19436c);
                return;
            default:
                this.f19435b.run(this.f19436c);
                return;
        }
    }
}
