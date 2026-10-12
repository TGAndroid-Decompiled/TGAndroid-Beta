package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nc implements Runnable {
    public final int f18379a;
    public final MessagesController.ErrorDelegate f18380b;
    public final TLRPC.TL_error f18381c;

    public nc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18379a = i10;
        this.f18380b = errorDelegate;
        this.f18381c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18379a) {
            case 0:
                this.f18380b.run(this.f18381c);
                return;
            default:
                this.f18380b.run(this.f18381c);
                return;
        }
    }
}
