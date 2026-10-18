package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ic implements Runnable {
    public final int f18618a;
    public final MessagesController.ErrorDelegate f18619b;
    public final TLRPC.TL_error f18620c;

    public ic(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18618a = i10;
        this.f18619b = errorDelegate;
        this.f18620c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18618a) {
            case 0:
                this.f18619b.run(this.f18620c);
                return;
            default:
                this.f18619b.run(this.f18620c);
                return;
        }
    }
}
