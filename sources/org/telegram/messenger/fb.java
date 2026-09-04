package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f17641a;
    public final MessagesController.ErrorDelegate f17642b;
    public final TLRPC.TL_error f17643c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17641a = i10;
        this.f17642b = errorDelegate;
        this.f17643c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17641a) {
            case 0:
                this.f17642b.run(this.f17643c);
                return;
            default:
                this.f17642b.run(this.f17643c);
                return;
        }
    }
}
