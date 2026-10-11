package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f18351a;
    public final MessagesController.ErrorDelegate f18352b;
    public final TLRPC.TL_error f18353c;

    public kc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18351a = i10;
        this.f18352b = errorDelegate;
        this.f18353c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18351a) {
            case 0:
                this.f18352b.run(this.f18353c);
                return;
            default:
                this.f18352b.run(this.f18353c);
                return;
        }
    }
}
