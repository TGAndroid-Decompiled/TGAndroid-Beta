package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class qe implements Runnable {
    public final int f19355a;
    public final MessagesStorage.IntCallback f19356b;
    public final int f19357c;

    public qe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19355a = i11;
        this.f19356b = intCallback;
        this.f19357c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19355a) {
            case 0:
                this.f19356b.run(this.f19357c);
                return;
            case 1:
                this.f19356b.run(this.f19357c);
                return;
            default:
                this.f19356b.run(this.f19357c);
                return;
        }
    }
}
