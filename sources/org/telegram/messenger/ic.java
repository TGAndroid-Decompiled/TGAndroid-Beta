package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16649a;
    public final MessagesController f16650b;
    public final TL_update.TL_updatePeerBlocked f16651c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16649a = i10;
        this.f16650b = messagesController;
        this.f16651c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16649a) {
            case 0:
                this.f16650b.lambda$processUpdateArray$391(this.f16651c);
                return;
            default:
                this.f16650b.lambda$processUpdateArray$390(this.f16651c);
                return;
        }
    }
}
