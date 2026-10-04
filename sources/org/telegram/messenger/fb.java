package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f17838a;
    public final MessagesController.ErrorDelegate f17839b;
    public final TLRPC.TL_error f17840c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17838a = i10;
        this.f17839b = errorDelegate;
        this.f17840c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17838a) {
            case 0:
                this.f17839b.run(this.f17840c);
                return;
            default:
                this.f17839b.run(this.f17840c);
                return;
        }
    }
}
