package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f18948a;
    public final MessagesController.ErrorDelegate f18949b;
    public final TLRPC.TL_error f18950c;

    public ib(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18948a = i10;
        this.f18949b = errorDelegate;
        this.f18950c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18948a) {
            case 0:
                this.f18949b.run(this.f18950c);
                return;
            default:
                this.f18949b.run(this.f18950c);
                return;
        }
    }
}
