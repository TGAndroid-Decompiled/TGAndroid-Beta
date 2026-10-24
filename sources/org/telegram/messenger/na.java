package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f19103a;
    public final MessagesController f19104b;
    public final TLRPC.Updates f19105c;
    public final boolean d;

    public na(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f19103a = i10;
        this.f19104b = messagesController;
        this.f19105c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19103a) {
            case 0:
                this.f19104b.lambda$processUpdates$378(this.f19105c, this.d);
                return;
            default:
                this.f19104b.lambda$processUpdates$377(this.f19105c, this.d);
                return;
        }
    }
}
