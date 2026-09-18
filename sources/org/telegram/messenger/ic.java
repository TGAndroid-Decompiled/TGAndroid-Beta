package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16587a;
    public final MessagesController f16588b;
    public final TL_update.TL_updatePeerBlocked f16589c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16587a = i10;
        this.f16588b = messagesController;
        this.f16589c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16587a) {
            case 0:
                this.f16588b.lambda$processUpdateArray$391(this.f16589c);
                return;
            default:
                this.f16588b.lambda$processUpdateArray$390(this.f16589c);
                return;
        }
    }
}
