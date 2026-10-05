package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f18162a;
    public final MessagesController f18163b;
    public final TL_update.TL_updatePeerBlocked f18164c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f18162a = i10;
        this.f18163b = messagesController;
        this.f18164c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f18162a) {
            case 0:
                this.f18163b.lambda$processUpdateArray$391(this.f18164c);
                return;
            default:
                this.f18163b.lambda$processUpdateArray$390(this.f18164c);
                return;
        }
    }
}
