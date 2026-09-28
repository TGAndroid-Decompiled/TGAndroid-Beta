package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16653a;
    public final MessagesController f16654b;
    public final TL_update.TL_updatePeerBlocked f16655c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16653a = i10;
        this.f16654b = messagesController;
        this.f16655c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16653a) {
            case 0:
                this.f16654b.lambda$processUpdateArray$391(this.f16655c);
                return;
            default:
                this.f16654b.lambda$processUpdateArray$390(this.f16655c);
                return;
        }
    }
}
