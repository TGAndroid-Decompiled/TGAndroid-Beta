package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16634a;
    public final MessagesController f16635b;
    public final TL_update.TL_updatePeerBlocked f16636c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16634a = i10;
        this.f16635b = messagesController;
        this.f16636c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16634a) {
            case 0:
                this.f16635b.lambda$processUpdateArray$391(this.f16636c);
                return;
            default:
                this.f16635b.lambda$processUpdateArray$390(this.f16636c);
                return;
        }
    }
}
