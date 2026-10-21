package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18777a;
    public final MessagesController f18778b;
    public final TLRPC.Updates f18779c;
    public final boolean d;

    public ka(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18777a = i10;
        this.f18778b = messagesController;
        this.f18779c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18777a) {
            case 0:
                this.f18778b.lambda$processUpdates$378(this.f18779c, this.d);
                return;
            default:
                this.f18778b.lambda$processUpdates$377(this.f18779c, this.d);
                return;
        }
    }
}
