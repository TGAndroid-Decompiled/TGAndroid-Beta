package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f20678a;
    public final MessagesController f20679b;
    public final TLRPC.Updates f20680c;
    public final boolean d;

    public ma(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f20678a = i10;
        this.f20679b = messagesController;
        this.f20680c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20678a) {
            case 0:
                this.f20679b.lambda$processUpdates$380(this.f20680c, this.d);
                return;
            default:
                this.f20679b.lambda$processUpdates$379(this.f20680c, this.d);
                return;
        }
    }
}
