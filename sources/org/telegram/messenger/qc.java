package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qc implements Runnable {
    public final int f19356a;
    public final MessagesController f19357b;
    public final TL_update.TL_updatePeerBlocked f19358c;

    public qc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19356a = i10;
        this.f19357b = messagesController;
        this.f19358c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19356a) {
            case 0:
                this.f19357b.lambda$processUpdateArray$394(this.f19358c);
                return;
            default:
                this.f19357b.lambda$processUpdateArray$393(this.f19358c);
                return;
        }
    }
}
