package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16111a;
    public final MessagesController.ErrorDelegate f16112b;
    public final TLRPC.TL_error f16113c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16111a = i10;
        this.f16112b = errorDelegate;
        this.f16113c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16111a) {
            case 0:
                this.f16112b.run(this.f16113c);
                return;
            default:
                this.f16112b.run(this.f16113c);
                return;
        }
    }
}
