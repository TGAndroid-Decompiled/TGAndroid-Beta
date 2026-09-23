package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16103a;
    public final MessagesController.ErrorDelegate f16104b;
    public final TLRPC.TL_error f16105c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16103a = i10;
        this.f16104b = errorDelegate;
        this.f16105c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16103a) {
            case 0:
                this.f16104b.run(this.f16105c);
                return;
            default:
                this.f16104b.run(this.f16105c);
                return;
        }
    }
}
