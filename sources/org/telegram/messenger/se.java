package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19156a;
    public final MessagesStorage.IntCallback f19157b;
    public final int f19158c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19156a = i11;
        this.f19157b = intCallback;
        this.f19158c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19156a) {
            case 0:
                this.f19157b.run(this.f19158c);
                return;
            case 1:
                this.f19157b.run(this.f19158c);
                return;
            default:
                this.f19157b.run(this.f19158c);
                return;
        }
    }
}
