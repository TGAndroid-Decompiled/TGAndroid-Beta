package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16335a;
    public final MessagesController.ErrorDelegate f16336b;
    public final TLRPC.TL_error f16337c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16335a = i10;
        this.f16336b = errorDelegate;
        this.f16337c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16335a) {
            case 0:
                this.f16336b.run(this.f16337c);
                return;
            default:
                this.f16336b.run(this.f16337c);
                return;
        }
    }
}
