package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jc implements Runnable {
    public final int f18696a;
    public final MessagesController.ErrorDelegate f18697b;
    public final TLRPC.TL_error f18698c;

    public jc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18696a = i10;
        this.f18697b = errorDelegate;
        this.f18698c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18696a) {
            case 0:
                this.f18697b.run(this.f18698c);
                return;
            default:
                this.f18697b.run(this.f18698c);
                return;
        }
    }
}
