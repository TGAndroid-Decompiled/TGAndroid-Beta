package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19152a;
    public final MessagesStorage.IntCallback f19153b;
    public final int f19154c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19152a = i11;
        this.f19153b = intCallback;
        this.f19154c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19152a) {
            case 0:
                this.f19153b.run(this.f19154c);
                return;
            case 1:
                this.f19153b.run(this.f19154c);
                return;
            default:
                this.f19153b.run(this.f19154c);
                return;
        }
    }
}
