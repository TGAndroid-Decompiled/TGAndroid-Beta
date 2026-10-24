package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nc implements Runnable {
    public final int f19113a;
    public final MessagesController.ErrorDelegate f19114b;
    public final TLRPC.TL_error f19115c;

    public nc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f19113a = i10;
        this.f19114b = errorDelegate;
        this.f19115c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19113a) {
            case 0:
                this.f19114b.run(this.f19115c);
                return;
            default:
                this.f19114b.run(this.f19115c);
                return;
        }
    }
}
