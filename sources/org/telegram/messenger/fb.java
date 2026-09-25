package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16361a;
    public final MessagesController.ErrorDelegate f16362b;
    public final TLRPC.TL_error f16363c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16361a = i10;
        this.f16362b = errorDelegate;
        this.f16363c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16361a) {
            case 0:
                this.f16362b.run(this.f16363c);
                return;
            default:
                this.f16362b.run(this.f16363c);
                return;
        }
    }
}
