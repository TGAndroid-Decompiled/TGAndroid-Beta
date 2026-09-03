package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class kc implements Runnable {
    public final int f17644a;
    public final MessagesController f17645b;
    public final TL_update.TL_updatePeerBlocked f17646c;

    public kc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f17644a = i10;
        this.f17645b = messagesController;
        this.f17646c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f17644a) {
            case 0:
                this.f17645b.lambda$processUpdateArray$391(this.f17646c);
                return;
            default:
                this.f17645b.lambda$processUpdateArray$390(this.f17646c);
                return;
        }
    }
}
