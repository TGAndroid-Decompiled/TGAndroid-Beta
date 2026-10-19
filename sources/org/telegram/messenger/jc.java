package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jc implements Runnable {
    public final int f18699a;
    public final MessagesController.ErrorDelegate f18700b;
    public final TLRPC.TL_error f18701c;

    public jc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18699a = i10;
        this.f18700b = errorDelegate;
        this.f18701c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18699a) {
            case 0:
                this.f18700b.run(this.f18701c);
                return;
            default:
                this.f18700b.run(this.f18701c);
                return;
        }
    }
}
