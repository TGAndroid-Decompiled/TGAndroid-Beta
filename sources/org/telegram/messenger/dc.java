package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class dc implements Runnable {
    public final int f20093a;
    public final MessagesController f20094b;
    public final TL_update.TL_updatePeerBlocked f20095c;

    public dc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i9) {
        this.f20093a = i9;
        this.f20094b = messagesController;
        this.f20095c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f20093a) {
            case 0:
                this.f20094b.lambda$processUpdateArray$391(this.f20095c);
                return;
            default:
                this.f20094b.lambda$processUpdateArray$390(this.f20095c);
                return;
        }
    }
}
