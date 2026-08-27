package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

public final class hc implements Runnable {

    public final int f20490a;

    public final MessagesController f20491b;

    public final TL_update.TL_updatePeerBlocked f20492c;

    public hc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f20490a = i10;
        this.f20491b = messagesController;
        this.f20492c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f20490a) {
            case 0:
                this.f20491b.lambda$processUpdateArray$391(this.f20492c);
                break;
            default:
                this.f20491b.lambda$processUpdateArray$390(this.f20492c);
                break;
        }
    }
}
