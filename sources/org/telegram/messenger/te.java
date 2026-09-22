package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class te implements Runnable {
    public final int f17625a;
    public final MessagesStorage.IntCallback f17626b;
    public final int f17627c;

    public te(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f17625a = i11;
        this.f17626b = intCallback;
        this.f17627c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17625a) {
            case 0:
                this.f17626b.run(this.f17627c);
                return;
            case 1:
                this.f17626b.run(this.f17627c);
                return;
            default:
                this.f17626b.run(this.f17627c);
                return;
        }
    }
}
