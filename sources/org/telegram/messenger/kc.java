package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f18387a;
    public final MessagesController.ErrorDelegate f18388b;
    public final TLRPC.TL_error f18389c;

    public kc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18387a = i10;
        this.f18388b = errorDelegate;
        this.f18389c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18387a) {
            case 0:
                this.f18388b.run(this.f18389c);
                return;
            default:
                this.f18388b.run(this.f18389c);
                return;
        }
    }
}
