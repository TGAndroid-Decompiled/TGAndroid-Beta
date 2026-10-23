package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f19029a;
    public final MessagesController f19030b;
    public final TLRPC.Updates f19031c;
    public final boolean d;

    public ma(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f19029a = i10;
        this.f19030b = messagesController;
        this.f19031c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19029a) {
            case 0:
                this.f19030b.lambda$processUpdates$378(this.f19031c, this.d);
                return;
            default:
                this.f19030b.lambda$processUpdates$377(this.f19031c, this.d);
                return;
        }
    }
}
