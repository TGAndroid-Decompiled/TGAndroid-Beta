package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class kc implements Runnable {
    public final int f17666a;
    public final MessagesController f17667b;
    public final TL_update.TL_updatePeerBlocked f17668c;

    public kc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f17666a = i10;
        this.f17667b = messagesController;
        this.f17668c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f17666a) {
            case 0:
                this.f17667b.lambda$processUpdateArray$391(this.f17668c);
                return;
            default:
                this.f17667b.lambda$processUpdateArray$390(this.f17668c);
                return;
        }
    }
}
