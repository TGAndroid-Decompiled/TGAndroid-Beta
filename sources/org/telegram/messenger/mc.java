package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mc implements Runnable {
    public final int f19039a;
    public final MessagesController.ErrorDelegate f19040b;
    public final TLRPC.TL_error f19041c;

    public mc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f19039a = i10;
        this.f19040b = errorDelegate;
        this.f19041c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19039a) {
            case 0:
                this.f19040b.run(this.f19041c);
                return;
            default:
                this.f19040b.run(this.f19041c);
                return;
        }
    }
}
