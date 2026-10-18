package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18608a;
    public final MessagesController f18609b;
    public final TLRPC.Updates f18610c;
    public final boolean d;

    public ia(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18608a = i10;
        this.f18609b = messagesController;
        this.f18610c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18608a) {
            case 0:
                this.f18609b.lambda$processUpdates$378(this.f18610c, this.d);
                return;
            default:
                this.f18609b.lambda$processUpdates$377(this.f18610c, this.d);
                return;
        }
    }
}
