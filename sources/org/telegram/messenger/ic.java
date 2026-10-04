package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f18157a;
    public final MessagesController f18158b;
    public final TL_update.TL_updatePeerBlocked f18159c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f18157a = i10;
        this.f18158b = messagesController;
        this.f18159c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f18157a) {
            case 0:
                this.f18158b.lambda$processUpdateArray$391(this.f18159c);
                return;
            default:
                this.f18158b.lambda$processUpdateArray$390(this.f18159c);
                return;
        }
    }
}
