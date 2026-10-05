package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f17843a;
    public final MessagesController.ErrorDelegate f17844b;
    public final TLRPC.TL_error f17845c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17843a = i10;
        this.f17844b = errorDelegate;
        this.f17845c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17843a) {
            case 0:
                this.f17844b.run(this.f17845c);
                return;
            default:
                this.f17844b.run(this.f17845c);
                return;
        }
    }
}
