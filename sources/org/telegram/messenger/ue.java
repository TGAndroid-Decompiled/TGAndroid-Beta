package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ue implements Runnable {
    public final int f19699a;
    public final MessagesStorage.IntCallback f19700b;
    public final int f19701c;

    public ue(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19699a = i11;
        this.f19700b = intCallback;
        this.f19701c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19699a) {
            case 0:
                this.f19700b.run(this.f19701c);
                return;
            case 1:
                this.f19700b.run(this.f19701c);
                return;
            default:
                this.f19700b.run(this.f19701c);
                return;
        }
    }
}
