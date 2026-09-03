package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f18950a;
    public final MessagesController.ErrorDelegate f18951b;
    public final TLRPC.TL_error f18952c;

    public ib(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18950a = i10;
        this.f18951b = errorDelegate;
        this.f18952c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18950a) {
            case 0:
                this.f18951b.run(this.f18952c);
                return;
            default:
                this.f18951b.run(this.f18952c);
                return;
        }
    }
}
