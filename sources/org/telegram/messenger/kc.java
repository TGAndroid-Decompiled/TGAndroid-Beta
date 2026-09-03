package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class kc implements Runnable {
    public final int f19165a;
    public final MessagesController f19166b;
    public final TL_update.TL_updatePeerBlocked f19167c;

    public kc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19165a = i10;
        this.f19166b = messagesController;
        this.f19167c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19165a) {
            case 0:
                this.f19166b.lambda$processUpdateArray$391(this.f19167c);
                return;
            default:
                this.f19166b.lambda$processUpdateArray$390(this.f19167c);
                return;
        }
    }
}
