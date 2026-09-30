package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16670a;
    public final MessagesController f16671b;
    public final TL_update.TL_updatePeerBlocked f16672c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16670a = i10;
        this.f16671b = messagesController;
        this.f16672c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16670a) {
            case 0:
                this.f16671b.lambda$processUpdateArray$391(this.f16672c);
                return;
            default:
                this.f16671b.lambda$processUpdateArray$390(this.f16672c);
                return;
        }
    }
}
