package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class pc implements Runnable {
    public final int f19272a;
    public final MessagesController f19273b;
    public final TL_update.TL_updatePeerBlocked f19274c;

    public pc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19272a = i10;
        this.f19273b = messagesController;
        this.f19274c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19272a) {
            case 0:
                this.f19273b.lambda$processUpdateArray$394(this.f19274c);
                return;
            default:
                this.f19273b.lambda$processUpdateArray$393(this.f19274c);
                return;
        }
    }
}
