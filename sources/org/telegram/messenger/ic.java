package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f18165a;
    public final MessagesController f18166b;
    public final TL_update.TL_updatePeerBlocked f18167c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f18165a = i10;
        this.f18166b = messagesController;
        this.f18167c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f18165a) {
            case 0:
                this.f18166b.lambda$processUpdateArray$391(this.f18167c);
                return;
            default:
                this.f18166b.lambda$processUpdateArray$390(this.f18167c);
                return;
        }
    }
}
