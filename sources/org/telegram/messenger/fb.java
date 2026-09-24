package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16346a;
    public final MessagesController.ErrorDelegate f16347b;
    public final TLRPC.TL_error f16348c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16346a = i10;
        this.f16347b = errorDelegate;
        this.f16348c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16346a) {
            case 0:
                this.f16347b.run(this.f16348c);
                return;
            default:
                this.f16347b.run(this.f16348c);
                return;
        }
    }
}
