package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16388a;
    public final MessagesController f16389b;
    public final TL_update.TL_updatePeerBlocked f16390c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16388a = i10;
        this.f16389b = messagesController;
        this.f16390c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16388a) {
            case 0:
                this.f16389b.lambda$processUpdateArray$391(this.f16390c);
                return;
            default:
                this.f16389b.lambda$processUpdateArray$390(this.f16390c);
                return;
        }
    }
}
