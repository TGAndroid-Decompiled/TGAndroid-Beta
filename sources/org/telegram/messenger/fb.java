package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16350a;
    public final MessagesController.ErrorDelegate f16351b;
    public final TLRPC.TL_error f16352c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16350a = i10;
        this.f16351b = errorDelegate;
        this.f16352c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16350a) {
            case 0:
                this.f16351b.run(this.f16352c);
                return;
            default:
                this.f16351b.run(this.f16352c);
                return;
        }
    }
}
