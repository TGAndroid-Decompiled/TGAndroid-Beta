package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18245a;
    public final MessagesController f18246b;
    public final TLRPC.Updates f18247c;
    public final boolean d;

    public ja(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18245a = i10;
        this.f18246b = messagesController;
        this.f18247c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18245a) {
            case 0:
                this.f18246b.lambda$processUpdates$378(this.f18247c, this.d);
                return;
            default:
                this.f18246b.lambda$processUpdates$377(this.f18247c, this.d);
                return;
        }
    }
}
