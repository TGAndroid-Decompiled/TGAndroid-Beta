package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lc implements Runnable {
    public final int f20584a;
    public final MessagesController.ErrorDelegate f20585b;
    public final TLRPC.TL_error f20586c;

    public lc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f20584a = i10;
        this.f20585b = errorDelegate;
        this.f20586c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20584a) {
            case 0:
                this.f20585b.run(this.f20586c);
                return;
            default:
                this.f20585b.run(this.f20586c);
                return;
        }
    }
}
