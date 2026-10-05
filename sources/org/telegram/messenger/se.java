package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19164a;
    public final MessagesStorage.IntCallback f19165b;
    public final int f19166c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19164a = i11;
        this.f19165b = intCallback;
        this.f19166c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19164a) {
            case 0:
                this.f19165b.run(this.f19166c);
                return;
            case 1:
                this.f19165b.run(this.f19166c);
                return;
            default:
                this.f19165b.run(this.f19166c);
                return;
        }
    }
}
