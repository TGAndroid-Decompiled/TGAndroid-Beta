package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class eb implements Runnable {
    public final int f17582a;
    public final MessagesController.ErrorDelegate f17583b;
    public final TLRPC.TL_error f17584c;

    public eb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17582a = i10;
        this.f17583b = errorDelegate;
        this.f17584c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17582a) {
            case 0:
                this.f17583b.run(this.f17584c);
                return;
            default:
                this.f17583b.run(this.f17584c);
                return;
        }
    }
}
