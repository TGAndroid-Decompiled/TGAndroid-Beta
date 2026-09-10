package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f15772a;
    public final MessagesController.ErrorDelegate f15773b;
    public final TLRPC.TL_error f15774c;

    public mb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f15772a = i10;
        this.f15773b = errorDelegate;
        this.f15774c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15772a) {
            case 0:
                this.f15773b.run(this.f15774c);
                return;
            default:
                this.f15773b.run(this.f15774c);
                return;
        }
    }
}
