package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class rc implements Runnable {
    public final int f19044a;
    public final MessagesController f19045b;
    public final TL_update.TL_updatePeerBlocked f19046c;

    public rc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19044a = i10;
        this.f19045b = messagesController;
        this.f19046c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19044a) {
            case 0:
                this.f19045b.lambda$processUpdateArray$394(this.f19046c);
                return;
            default:
                this.f19045b.lambda$processUpdateArray$393(this.f19046c);
                return;
        }
    }
}
