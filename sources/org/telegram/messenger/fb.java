package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16117a;
    public final MessagesController.ErrorDelegate f16118b;
    public final TLRPC.TL_error f16119c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16117a = i10;
        this.f16118b = errorDelegate;
        this.f16119c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16117a) {
            case 0:
                this.f16118b.run(this.f16119c);
                return;
            default:
                this.f16118b.run(this.f16119c);
                return;
        }
    }
}
