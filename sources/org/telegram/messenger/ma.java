package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f18265a;
    public final MessagesController f18266b;
    public final TLRPC.Updates f18267c;
    public final boolean d;

    public ma(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18265a = i10;
        this.f18266b = messagesController;
        this.f18267c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                this.f18266b.lambda$processUpdates$378(this.f18267c, this.d);
                return;
            default:
                this.f18266b.lambda$processUpdates$377(this.f18267c, this.d);
                return;
        }
    }
}
