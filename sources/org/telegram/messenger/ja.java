package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18250a;
    public final MessagesController f18251b;
    public final TLRPC.Updates f18252c;
    public final boolean d;

    public ja(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18250a = i10;
        this.f18251b = messagesController;
        this.f18252c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18250a) {
            case 0:
                this.f18251b.lambda$processUpdates$378(this.f18252c, this.d);
                return;
            default:
                this.f18251b.lambda$processUpdates$377(this.f18252c, this.d);
                return;
        }
    }
}
