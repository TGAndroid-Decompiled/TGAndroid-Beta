package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class fb implements Runnable {

    public final int f20244a;

    public final MessagesController.ErrorDelegate f20245b;

    public final TLRPC.TL_error f20246c;

    public fb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f20244a = i10;
        this.f20245b = errorDelegate;
        this.f20246c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20244a) {
            case 0:
                this.f20245b.run(this.f20246c);
                break;
            default:
                this.f20245b.run(this.f20246c);
                break;
        }
    }
}
