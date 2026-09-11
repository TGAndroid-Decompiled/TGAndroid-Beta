package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class eb implements Runnable {
    public final int f17555a;
    public final MessagesController.ErrorDelegate f17556b;
    public final TLRPC.TL_error f17557c;

    public eb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17555a = i10;
        this.f17556b = errorDelegate;
        this.f17557c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17555a) {
            case 0:
                this.f17556b.run(this.f17557c);
                return;
            default:
                this.f17556b.run(this.f17557c);
                return;
        }
    }
}
