package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nc implements Runnable {
    public final int f19047a;
    public final MessagesController.ErrorDelegate f19048b;
    public final TLRPC.TL_error f19049c;

    public nc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f19047a = i10;
        this.f19048b = errorDelegate;
        this.f19049c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19047a) {
            case 0:
                this.f19048b.run(this.f19049c);
                return;
            default:
                this.f19048b.run(this.f19049c);
                return;
        }
    }
}
