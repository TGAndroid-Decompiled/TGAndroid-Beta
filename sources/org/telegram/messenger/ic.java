package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16635a;
    public final MessagesController f16636b;
    public final TL_update.TL_updatePeerBlocked f16637c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16635a = i10;
        this.f16636b = messagesController;
        this.f16637c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16635a) {
            case 0:
                this.f16636b.lambda$processUpdateArray$391(this.f16637c);
                return;
            default:
                this.f16636b.lambda$processUpdateArray$390(this.f16637c);
                return;
        }
    }
}
