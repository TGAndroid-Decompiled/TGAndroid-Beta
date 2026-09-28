package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16369a;
    public final MessagesController.ErrorDelegate f16370b;
    public final TLRPC.TL_error f16371c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16369a = i10;
        this.f16370b = errorDelegate;
        this.f16371c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16369a) {
            case 0:
                this.f16370b.run(this.f16371c);
                return;
            default:
                this.f16370b.run(this.f16371c);
                return;
        }
    }
}
