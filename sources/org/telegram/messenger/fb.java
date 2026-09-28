package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16370a;
    public final MessagesController.ErrorDelegate f16371b;
    public final TLRPC.TL_error f16372c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16370a = i10;
        this.f16371b = errorDelegate;
        this.f16372c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16370a) {
            case 0:
                this.f16371b.run(this.f16372c);
                return;
            default:
                this.f16371b.run(this.f16372c);
                return;
        }
    }
}
