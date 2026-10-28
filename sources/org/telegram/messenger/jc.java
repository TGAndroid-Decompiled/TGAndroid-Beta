package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jc implements Runnable {
    public final int f20428a;
    public final MessagesController.ErrorDelegate f20429b;
    public final TLRPC.TL_error f20430c;

    public jc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f20428a = i10;
        this.f20429b = errorDelegate;
        this.f20430c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20428a) {
            case 0:
                this.f20429b.run(this.f20430c);
                return;
            default:
                this.f20429b.run(this.f20430c);
                return;
        }
    }
}
