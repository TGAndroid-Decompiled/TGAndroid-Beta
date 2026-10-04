package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class se implements Runnable {
    public final int f19153a;
    public final MessagesStorage.IntCallback f19154b;
    public final int f19155c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19153a = i11;
        this.f19154b = intCallback;
        this.f19155c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19153a) {
            case 0:
                this.f19154b.run(this.f19155c);
                return;
            case 1:
                this.f19154b.run(this.f19155c);
                return;
            default:
                this.f19154b.run(this.f19155c);
                return;
        }
    }
}
