package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18286a;
    public final MessagesController f18287b;
    public final TLRPC.Updates f18288c;
    public final boolean d;

    public ja(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18286a = i10;
        this.f18287b = messagesController;
        this.f18288c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18286a) {
            case 0:
                this.f18287b.lambda$processUpdates$378(this.f18288c, this.d);
                return;
            default:
                this.f18287b.lambda$processUpdates$377(this.f18288c, this.d);
                return;
        }
    }
}
