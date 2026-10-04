package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f17844a;
    public final MessagesController.ErrorDelegate f17845b;
    public final TLRPC.TL_error f17846c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17844a = i10;
        this.f17845b = errorDelegate;
        this.f17846c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17844a) {
            case 0:
                this.f17845b.run(this.f17846c);
                return;
            default:
                this.f17845b.run(this.f17846c);
                return;
        }
    }
}
