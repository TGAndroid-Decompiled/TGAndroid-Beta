package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16358a;
    public final MessagesController.ErrorDelegate f16359b;
    public final TLRPC.TL_error f16360c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16358a = i10;
        this.f16359b = errorDelegate;
        this.f16360c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16358a) {
            case 0:
                this.f16359b.run(this.f16360c);
                return;
            default:
                this.f16359b.run(this.f16360c);
                return;
        }
    }
}
