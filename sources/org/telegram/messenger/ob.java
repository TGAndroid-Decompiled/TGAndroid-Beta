package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ob implements Runnable {
    public final int f20852a;
    public final MessagesController f20853b;
    public final TL_update.TL_updatePeerBlocked f20854c;

    public ob(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f20852a = i10;
        this.f20853b = messagesController;
        this.f20854c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f20852a) {
            case 0:
                this.f20853b.lambda$processUpdateArray$395(this.f20854c);
                return;
            default:
                this.f20853b.lambda$processUpdateArray$396(this.f20854c);
                return;
        }
    }
}
