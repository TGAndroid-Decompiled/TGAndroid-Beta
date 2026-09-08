package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f17992a;
    public final MessagesController f17993b;
    public final TL_update.TL_updatePeerBlocked f17994c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f17992a = i10;
        this.f17993b = messagesController;
        this.f17994c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f17992a) {
            case 0:
                this.f17993b.lambda$processUpdateArray$391(this.f17994c);
                return;
            default:
                this.f17993b.lambda$processUpdateArray$390(this.f17994c);
                return;
        }
    }
}
