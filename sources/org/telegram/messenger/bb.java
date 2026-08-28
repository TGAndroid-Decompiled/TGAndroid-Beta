package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class bb implements Runnable {
    public final int f19828a;
    public final MessagesController.ErrorDelegate f19829b;
    public final TLRPC.TL_error f19830c;

    public bb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i9) {
        this.f19828a = i9;
        this.f19829b = errorDelegate;
        this.f19830c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19828a) {
            case 0:
                this.f19829b.run(this.f19830c);
                return;
            default:
                this.f19829b.run(this.f19830c);
                return;
        }
    }
}
