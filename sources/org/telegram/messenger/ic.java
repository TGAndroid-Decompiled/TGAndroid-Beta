package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16403a;
    public final MessagesController f16404b;
    public final TL_update.TL_updatePeerBlocked f16405c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16403a = i10;
        this.f16404b = messagesController;
        this.f16405c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16403a) {
            case 0:
                this.f16404b.lambda$processUpdateArray$391(this.f16405c);
                return;
            default:
                this.f16404b.lambda$processUpdateArray$390(this.f16405c);
                return;
        }
    }
}
