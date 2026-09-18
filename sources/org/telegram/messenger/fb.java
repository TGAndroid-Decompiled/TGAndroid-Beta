package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16295a;
    public final MessagesController.ErrorDelegate f16296b;
    public final TLRPC.TL_error f16297c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16295a = i10;
        this.f16296b = errorDelegate;
        this.f16297c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16295a) {
            case 0:
                this.f16296b.run(this.f16297c);
                return;
            default:
                this.f16296b.run(this.f16297c);
                return;
        }
    }
}
