package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class jc implements Runnable {
    public final int f20672a;
    public final MessagesController f20673b;
    public final TL_update.TL_updatePeerBlocked f20674c;

    public jc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f20672a = i10;
        this.f20673b = messagesController;
        this.f20674c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f20672a) {
            case 0:
                this.f20673b.lambda$processUpdateArray$391(this.f20674c);
                return;
            default:
                this.f20673b.lambda$processUpdateArray$390(this.f20674c);
                return;
        }
    }
}
