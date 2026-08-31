package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class kc implements Runnable {
    public final int f19163a;
    public final MessagesController f19164b;
    public final TL_update.TL_updatePeerBlocked f19165c;

    public kc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19163a = i10;
        this.f19164b = messagesController;
        this.f19165c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19163a) {
            case 0:
                this.f19164b.lambda$processUpdateArray$391(this.f19165c);
                return;
            default:
                this.f19164b.lambda$processUpdateArray$390(this.f19165c);
                return;
        }
    }
}
