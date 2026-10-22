package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f19037a;
    public final MessagesController f19038b;
    public final TLRPC.Updates f19039c;
    public final boolean d;

    public na(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f19037a = i10;
        this.f19038b = messagesController;
        this.f19039c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19037a) {
            case 0:
                this.f19038b.lambda$processUpdates$378(this.f19039c, this.d);
                return;
            default:
                this.f19038b.lambda$processUpdates$377(this.f19039c, this.d);
                return;
        }
    }
}
