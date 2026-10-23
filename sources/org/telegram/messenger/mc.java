package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mc implements Runnable {
    public final int f18975a;
    public final MessagesController.ErrorDelegate f18976b;
    public final TLRPC.TL_error f18977c;

    public mc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18975a = i10;
        this.f18976b = errorDelegate;
        this.f18977c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18975a) {
            case 0:
                this.f18976b.run(this.f18977c);
                return;
            default:
                this.f18976b.run(this.f18977c);
                return;
        }
    }
}
