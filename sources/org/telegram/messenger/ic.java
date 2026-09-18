package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16412a;
    public final MessagesController f16413b;
    public final TL_update.TL_updatePeerBlocked f16414c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16412a = i10;
        this.f16413b = messagesController;
        this.f16414c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16412a) {
            case 0:
                this.f16413b.lambda$processUpdateArray$391(this.f16414c);
                return;
            default:
                this.f16413b.lambda$processUpdateArray$390(this.f16414c);
                return;
        }
    }
}
