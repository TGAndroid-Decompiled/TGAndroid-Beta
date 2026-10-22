package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ve implements Runnable {
    public final int f19772a;
    public final MessagesStorage.IntCallback f19773b;
    public final int f19774c;

    public ve(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19772a = i11;
        this.f19773b = intCallback;
        this.f19774c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19772a) {
            case 0:
                this.f19773b.run(this.f19774c);
                return;
            case 1:
                this.f19773b.run(this.f19774c);
                return;
            default:
                this.f19773b.run(this.f19774c);
                return;
        }
    }
}
