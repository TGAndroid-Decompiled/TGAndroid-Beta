package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class hc implements Runnable {
    public final int f17912a;
    public final MessagesController f17913b;
    public final TL_update.TL_updatePeerBlocked f17914c;

    public hc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f17912a = i10;
        this.f17913b = messagesController;
        this.f17914c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f17912a) {
            case 0:
                this.f17913b.lambda$processUpdateArray$391(this.f17914c);
                return;
            default:
                this.f17913b.lambda$processUpdateArray$390(this.f17914c);
                return;
        }
    }
}
