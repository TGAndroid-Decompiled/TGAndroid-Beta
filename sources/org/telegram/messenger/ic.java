package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16400a;
    public final MessagesController f16401b;
    public final TL_update.TL_updatePeerBlocked f16402c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16400a = i10;
        this.f16401b = messagesController;
        this.f16402c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16400a) {
            case 0:
                this.f16401b.lambda$processUpdateArray$391(this.f16402c);
                return;
            default:
                this.f16401b.lambda$processUpdateArray$390(this.f16402c);
                return;
        }
    }
}
