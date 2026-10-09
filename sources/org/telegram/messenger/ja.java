package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18241a;
    public final MessagesController f18242b;
    public final TLRPC.Updates f18243c;
    public final boolean d;

    public ja(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18241a = i10;
        this.f18242b = messagesController;
        this.f18243c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18241a) {
            case 0:
                this.f18242b.lambda$processUpdates$378(this.f18243c, this.d);
                return;
            default:
                this.f18242b.lambda$processUpdates$377(this.f18243c, this.d);
                return;
        }
    }
}
