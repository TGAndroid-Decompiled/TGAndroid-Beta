package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f18166a;
    public final MessagesController f18167b;
    public final TL_update.TL_updatePeerBlocked f18168c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f18166a = i10;
        this.f18167b = messagesController;
        this.f18168c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f18166a) {
            case 0:
                this.f18167b.lambda$processUpdateArray$391(this.f18168c);
                return;
            default:
                this.f18167b.lambda$processUpdateArray$390(this.f18168c);
                return;
        }
    }
}
