package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class hf implements Runnable {
    public final int f20259a;
    public final MessagesStorage.IntCallback f20260b;
    public final int f20261c;

    public hf(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f20259a = i11;
        this.f20260b = intCallback;
        this.f20261c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20259a) {
            case 0:
                this.f20260b.run(this.f20261c);
                return;
            case 1:
                this.f20260b.run(this.f20261c);
                return;
            default:
                this.f20260b.run(this.f20261c);
                return;
        }
    }
}
