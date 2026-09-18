package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class te implements Runnable {
    public final int f17406a;
    public final MessagesStorage.IntCallback f17407b;
    public final int f17408c;

    public te(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17406a = i11;
        this.f17407b = intCallback;
        this.f17408c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17406a) {
            case 0:
                this.f17407b.run(this.f17408c);
                return;
            case 1:
                this.f17407b.run(this.f17408c);
                return;
            default:
                this.f17407b.run(this.f17408c);
                return;
        }
    }
}
