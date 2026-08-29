package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class hb implements Runnable {
    public final int f20434a;
    public final MessagesController.ErrorDelegate f20435b;
    public final TLRPC.TL_error f20436c;

    public hb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f20434a = i10;
        this.f20435b = errorDelegate;
        this.f20436c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20434a) {
            case 0:
                this.f20435b.run(this.f20436c);
                return;
            default:
                this.f20435b.run(this.f20436c);
                return;
        }
    }
}
