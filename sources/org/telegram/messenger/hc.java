package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class hc implements Runnable {
    public final int f17885a;
    public final MessagesController f17886b;
    public final TL_update.TL_updatePeerBlocked f17887c;

    public hc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f17885a = i10;
        this.f17886b = messagesController;
        this.f17887c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f17885a) {
            case 0:
                this.f17886b.lambda$processUpdateArray$391(this.f17887c);
                return;
            default:
                this.f17886b.lambda$processUpdateArray$390(this.f17887c);
                return;
        }
    }
}
