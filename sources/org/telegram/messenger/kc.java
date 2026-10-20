package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f18794a;
    public final MessagesController.ErrorDelegate f18795b;
    public final TLRPC.TL_error f18796c;

    public kc(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.f18794a = i10;
        this.f18795b = errorDelegate;
        this.f18796c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18794a) {
            case 0:
                this.f18795b.run(this.f18796c);
                return;
            default:
                this.f18795b.run(this.f18796c);
                return;
        }
    }
}
