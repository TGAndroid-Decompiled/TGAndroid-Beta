package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f18349a;
    public final MessagesController.ErrorDelegate f18350b;
    public final TLRPC.TL_error f18351c;

    public kc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18349a = i10;
        this.f18350b = errorDelegate;
        this.f18351c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18349a) {
            case 0:
                this.f18350b.run(this.f18351c);
                return;
            default:
                this.f18350b.run(this.f18351c);
                return;
        }
    }
}
