package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nc implements Runnable {
    public final int f17647a;
    public final MessagesController.ErrorDelegate f17648b;
    public final TLRPC.TL_error f17649c;

    public nc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17647a = i10;
        this.f17648b = errorDelegate;
        this.f17649c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17647a) {
            case 0:
                this.f17648b.run(this.f17649c);
                return;
            default:
                this.f17648b.run(this.f17649c);
                return;
        }
    }
}
