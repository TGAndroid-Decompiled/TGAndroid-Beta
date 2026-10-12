package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f18266a;
    public final MessagesController f18267b;
    public final TLRPC.Updates f18268c;
    public final boolean d;

    public ma(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f18266a = i10;
        this.f18267b = messagesController;
        this.f18268c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18266a) {
            case 0:
                this.f18267b.lambda$processUpdates$378(this.f18268c, this.d);
                return;
            default:
                this.f18267b.lambda$processUpdates$377(this.f18268c, this.d);
                return;
        }
    }
}
