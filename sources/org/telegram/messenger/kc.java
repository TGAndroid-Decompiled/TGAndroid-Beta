package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f18787a;
    public final MessagesController.ErrorDelegate f18788b;
    public final TLRPC.TL_error f18789c;

    public kc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18787a = i10;
        this.f18788b = errorDelegate;
        this.f18789c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18787a) {
            case 0:
                this.f18788b.run(this.f18789c);
                return;
            default:
                this.f18788b.run(this.f18789c);
                return;
        }
    }
}
