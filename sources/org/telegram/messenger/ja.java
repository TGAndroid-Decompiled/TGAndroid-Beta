package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18686a;
    public final MessagesController f18687b;
    public final TLRPC.Updates f18688c;
    public final boolean d;

    public ja(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18686a = i10;
        this.f18687b = messagesController;
        this.f18688c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18686a) {
            case 0:
                this.f18687b.lambda$processUpdates$378(this.f18688c, this.d);
                return;
            default:
                this.f18687b.lambda$processUpdates$377(this.f18688c, this.d);
                return;
        }
    }
}
