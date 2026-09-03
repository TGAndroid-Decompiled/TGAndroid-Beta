package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f17455a;
    public final MessagesController.ErrorDelegate f17456b;
    public final TLRPC.TL_error f17457c;

    public ib(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17455a = i10;
        this.f17456b = errorDelegate;
        this.f17457c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17455a) {
            case 0:
                this.f17456b.run(this.f17457c);
                return;
            default:
                this.f17456b.run(this.f17457c);
                return;
        }
    }
}
