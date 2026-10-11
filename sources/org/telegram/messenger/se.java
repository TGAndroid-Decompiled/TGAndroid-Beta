package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19162a;
    public final MessagesStorage.IntCallback f19163b;
    public final int f19164c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19162a = i11;
        this.f19163b = intCallback;
        this.f19164c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19162a) {
            case 0:
                this.f19163b.run(this.f19164c);
                return;
            case 1:
                this.f19163b.run(this.f19164c);
                return;
            default:
                this.f19163b.run(this.f19164c);
                return;
        }
    }
}
