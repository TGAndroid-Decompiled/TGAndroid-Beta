package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16654a;
    public final MessagesController f16655b;
    public final TL_update.TL_updatePeerBlocked f16656c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16654a = i10;
        this.f16655b = messagesController;
        this.f16656c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16654a) {
            case 0:
                this.f16655b.lambda$processUpdateArray$391(this.f16656c);
                return;
            default:
                this.f16655b.lambda$processUpdateArray$390(this.f16656c);
                return;
        }
    }
}
