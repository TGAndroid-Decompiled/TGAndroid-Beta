package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ic implements Runnable {
    public final int f18607a;
    public final MessagesController.ErrorDelegate f18608b;
    public final TLRPC.TL_error f18609c;

    public ic(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18607a = i10;
        this.f18608b = errorDelegate;
        this.f18609c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18607a) {
            case 0:
                this.f18608b.run(this.f18609c);
                return;
            default:
                this.f18608b.run(this.f18609c);
                return;
        }
    }
}
