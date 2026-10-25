package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class kb implements Runnable {
    public final int f20511a;
    public final MessagesController f20512b;
    public final TL_update.TL_updatePeerBlocked f20513c;

    public kb(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f20511a = i10;
        this.f20512b = messagesController;
        this.f20513c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f20511a) {
            case 0:
                this.f20512b.lambda$processUpdateArray$395(this.f20513c);
                return;
            default:
                this.f20512b.lambda$processUpdateArray$396(this.f20513c);
                return;
        }
    }
}
