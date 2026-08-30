package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f17474a;
    public final MessagesController.ErrorDelegate f17475b;
    public final TLRPC.TL_error f17476c;

    public ib(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17474a = i10;
        this.f17475b = errorDelegate;
        this.f17476c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17474a) {
            case 0:
                this.f17475b.run(this.f17476c);
                return;
            default:
                this.f17475b.run(this.f17476c);
                return;
        }
    }
}
