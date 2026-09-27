package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16646a;
    public final MessagesController f16647b;
    public final TL_update.TL_updatePeerBlocked f16648c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16646a = i10;
        this.f16647b = messagesController;
        this.f16648c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16646a) {
            case 0:
                this.f16647b.lambda$processUpdateArray$391(this.f16648c);
                return;
            default:
                this.f16647b.lambda$processUpdateArray$390(this.f16648c);
                return;
        }
    }
}
