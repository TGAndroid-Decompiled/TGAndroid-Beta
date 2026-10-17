package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18597a;
    public final MessagesController f18598b;
    public final TLRPC.Updates f18599c;
    public final boolean d;

    public ia(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18597a = i10;
        this.f18598b = messagesController;
        this.f18599c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18597a) {
            case 0:
                this.f18598b.lambda$processUpdates$378(this.f18599c, this.d);
                return;
            default:
                this.f18598b.lambda$processUpdates$377(this.f18599c, this.d);
                return;
        }
    }
}
