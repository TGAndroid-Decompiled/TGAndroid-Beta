package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f18965a;
    public final MessagesController f18966b;
    public final TLRPC.Updates f18967c;
    public final boolean d;

    public ma(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18965a = i10;
        this.f18966b = messagesController;
        this.f18967c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18965a) {
            case 0:
                this.f18966b.lambda$processUpdates$378(this.f18967c, this.d);
                return;
            default:
                this.f18966b.lambda$processUpdates$377(this.f18967c, this.d);
                return;
        }
    }
}
