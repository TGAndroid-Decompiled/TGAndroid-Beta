package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f17965a;
    public final MessagesController f17966b;
    public final TL_update.TL_updatePeerBlocked f17967c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f17965a = i10;
        this.f17966b = messagesController;
        this.f17967c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f17965a) {
            case 0:
                this.f17966b.lambda$processUpdateArray$391(this.f17967c);
                return;
            default:
                this.f17966b.lambda$processUpdateArray$390(this.f17967c);
                return;
        }
    }
}
