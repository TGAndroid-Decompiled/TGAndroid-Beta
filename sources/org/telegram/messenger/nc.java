package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nc implements Runnable {
    public final int f18380a;
    public final MessagesController.ErrorDelegate f18381b;
    public final TLRPC.TL_error f18382c;

    public nc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18380a = i10;
        this.f18381b = errorDelegate;
        this.f18382c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18380a) {
            case 0:
                this.f18381b.run(this.f18382c);
                return;
            default:
                this.f18381b.run(this.f18382c);
                return;
        }
    }
}
