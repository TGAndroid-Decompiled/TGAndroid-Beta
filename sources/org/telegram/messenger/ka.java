package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18784a;
    public final MessagesController f18785b;
    public final TLRPC.Updates f18786c;
    public final boolean d;

    public ka(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18784a = i10;
        this.f18785b = messagesController;
        this.f18786c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18784a) {
            case 0:
                this.f18785b.lambda$processUpdates$378(this.f18786c, this.d);
                return;
            default:
                this.f18785b.lambda$processUpdates$377(this.f18786c, this.d);
                return;
        }
    }
}
