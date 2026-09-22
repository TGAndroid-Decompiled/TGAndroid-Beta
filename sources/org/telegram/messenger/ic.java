package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ic implements Runnable {
    public final int f16650a;
    public final MessagesController f16651b;
    public final TL_update.TL_updatePeerBlocked f16652c;

    public ic(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16650a = i10;
        this.f16651b = messagesController;
        this.f16652c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16650a) {
            case 0:
                this.f16651b.lambda$processUpdateArray$391(this.f16652c);
                return;
            default:
                this.f16651b.lambda$processUpdateArray$390(this.f16652c);
                return;
        }
    }
}
