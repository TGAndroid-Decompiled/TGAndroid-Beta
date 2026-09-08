package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f17668a;
    public final MessagesController.ErrorDelegate f17669b;
    public final TLRPC.TL_error f17670c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17668a = i10;
        this.f17669b = errorDelegate;
        this.f17670c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17668a) {
            case 0:
                this.f17669b.run(this.f17670c);
                return;
            default:
                this.f17669b.run(this.f17670c);
                return;
        }
    }
}
