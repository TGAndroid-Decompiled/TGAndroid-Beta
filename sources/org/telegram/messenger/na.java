package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f20769a;
    public final MessagesController f20770b;
    public final TLRPC.Updates f20771c;
    public final boolean d;

    public na(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f20769a = i10;
        this.f20770b = messagesController;
        this.f20771c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20769a) {
            case 0:
                this.f20770b.lambda$processUpdates$380(this.f20771c, this.d);
                return;
            default:
                this.f20770b.lambda$processUpdates$379(this.f20771c, this.d);
                return;
        }
    }
}
