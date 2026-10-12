package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nc implements Runnable {
    public final int f17950a;
    public final MessagesController.ErrorDelegate f17951b;
    public final TLRPC.TL_error f17952c;

    public nc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f17950a = i10;
        this.f17951b = errorDelegate;
        this.f17952c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17950a) {
            case 0:
                this.f17951b.run(this.f17952c);
                return;
            default:
                this.f17951b.run(this.f17952c);
                return;
        }
    }
}
