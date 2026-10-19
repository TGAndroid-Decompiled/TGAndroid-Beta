package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ic implements Runnable {
    public final int f18615a;
    public final MessagesController.ErrorDelegate f18616b;
    public final TLRPC.TL_error f18617c;

    public ic(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18615a = i10;
        this.f18616b = errorDelegate;
        this.f18617c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18615a) {
            case 0:
                this.f18616b.run(this.f18617c);
                return;
            default:
                this.f18616b.run(this.f18617c);
                return;
        }
    }
}
