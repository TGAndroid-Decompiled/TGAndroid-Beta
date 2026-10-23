package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class tc implements Runnable {
    public final int f19611a;
    public final MessagesController f19612b;
    public final TL_update.TL_updatePeerBlocked f19613c;

    public tc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19611a = i10;
        this.f19612b = messagesController;
        this.f19613c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19611a) {
            case 0:
                this.f19612b.lambda$processUpdateArray$394(this.f19613c);
                return;
            default:
                this.f19612b.lambda$processUpdateArray$393(this.f19613c);
                return;
        }
    }
}
