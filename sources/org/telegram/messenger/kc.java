package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f18353a;
    public final MessagesController.ErrorDelegate f18354b;
    public final TLRPC.TL_error f18355c;

    public kc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18353a = i10;
        this.f18354b = errorDelegate;
        this.f18355c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18353a) {
            case 0:
                this.f18354b.run(this.f18355c);
                return;
            default:
                this.f18354b.run(this.f18355c);
                return;
        }
    }
}
