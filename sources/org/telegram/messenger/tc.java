package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class tc implements Runnable {
    public final int f19676a;
    public final MessagesController f19677b;
    public final TL_update.TL_updatePeerBlocked f19678c;

    public tc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19676a = i10;
        this.f19677b = messagesController;
        this.f19678c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19676a) {
            case 0:
                this.f19677b.lambda$processUpdateArray$394(this.f19678c);
                return;
            default:
                this.f19677b.lambda$processUpdateArray$393(this.f19678c);
                return;
        }
    }
}
