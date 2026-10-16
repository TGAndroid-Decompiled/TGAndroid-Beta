package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f17551a;
    public final MessagesController f17552b;
    public final TLRPC.Updates f17553c;
    public final boolean d;

    public ma(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f17551a = i10;
        this.f17552b = messagesController;
        this.f17553c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17551a) {
            case 0:
                this.f17552b.lambda$processUpdates$378(this.f17553c, this.d);
                return;
            default:
                this.f17552b.lambda$processUpdates$377(this.f17553c, this.d);
                return;
        }
    }
}
