package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16386a;
    public final MessagesController.ErrorDelegate f16387b;
    public final TLRPC.TL_error f16388c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16386a = i10;
        this.f16387b = errorDelegate;
        this.f16388c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16386a) {
            case 0:
                this.f16387b.run(this.f16388c);
                return;
            default:
                this.f16387b.run(this.f16388c);
                return;
        }
    }
}
