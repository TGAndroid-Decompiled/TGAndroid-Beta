package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18605a;
    public final MessagesController f18606b;
    public final TLRPC.Updates f18607c;
    public final boolean d;

    public ia(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18605a = i10;
        this.f18606b = messagesController;
        this.f18607c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18605a) {
            case 0:
                this.f18606b.lambda$processUpdates$378(this.f18607c, this.d);
                return;
            default:
                this.f18606b.lambda$processUpdates$377(this.f18607c, this.d);
                return;
        }
    }
}
