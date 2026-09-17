package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fb implements Runnable {
    public final int f16126a;
    public final MessagesController.ErrorDelegate f16127b;
    public final TLRPC.TL_error f16128c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f16126a = i10;
        this.f16127b = errorDelegate;
        this.f16128c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16126a) {
            case 0:
                this.f16127b.run(this.f16128c);
                return;
            default:
                this.f16127b.run(this.f16128c);
                return;
        }
    }
}
