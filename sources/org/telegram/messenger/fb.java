package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f17845a;
    public final MessagesController.ErrorDelegate f17846b;
    public final TLRPC.TL_error f17847c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17845a = i10;
        this.f17846b = errorDelegate;
        this.f17847c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17845a) {
            case 0:
                this.f17846b.run(this.f17847c);
                return;
            default:
                this.f17846b.run(this.f17847c);
                return;
        }
    }
}
