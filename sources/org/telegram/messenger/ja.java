package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18689a;
    public final MessagesController f18690b;
    public final TLRPC.Updates f18691c;
    public final boolean d;

    public ja(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18689a = i10;
        this.f18690b = messagesController;
        this.f18691c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18689a) {
            case 0:
                this.f18690b.lambda$processUpdates$378(this.f18691c, this.d);
                return;
            default:
                this.f18690b.lambda$processUpdates$377(this.f18691c, this.d);
                return;
        }
    }
}
