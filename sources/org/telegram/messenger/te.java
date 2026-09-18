package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class te implements Runnable {
    public final int f17579a;
    public final MessagesStorage.IntCallback f17580b;
    public final int f17581c;

    public te(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17579a = i11;
        this.f17580b = intCallback;
        this.f17581c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17579a) {
            case 0:
                this.f17580b.run(this.f17581c);
                return;
            case 1:
                this.f17580b.run(this.f17581c);
                return;
            default:
                this.f17580b.run(this.f17581c);
                return;
        }
    }
}
