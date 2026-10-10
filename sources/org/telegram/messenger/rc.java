package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class rc implements Runnable {
    public final int f19048a;
    public final MessagesController f19049b;
    public final TL_update.TL_updatePeerBlocked f19050c;

    public rc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19048a = i10;
        this.f19049b = messagesController;
        this.f19050c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19048a) {
            case 0:
                this.f19049b.lambda$processUpdateArray$394(this.f19050c);
                return;
            default:
                this.f19049b.lambda$processUpdateArray$393(this.f19050c);
                return;
        }
    }
}
