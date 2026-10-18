package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class qe implements Runnable {
    public final int f19360a;
    public final MessagesStorage.IntCallback f19361b;
    public final int f19362c;

    public qe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19360a = i11;
        this.f19361b = intCallback;
        this.f19362c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19360a) {
            case 0:
                this.f19361b.run(this.f19362c);
                return;
            case 1:
                this.f19361b.run(this.f19362c);
                return;
            default:
                this.f19361b.run(this.f19362c);
                return;
        }
    }
}
