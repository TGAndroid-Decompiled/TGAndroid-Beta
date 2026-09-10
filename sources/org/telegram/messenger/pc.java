package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class pc implements Runnable {
    public final int f16050a;
    public final MessagesController f16051b;
    public final TL_update.TL_updatePeerBlocked f16052c;

    public pc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f16050a = i10;
        this.f16051b = messagesController;
        this.f16052c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f16050a) {
            case 0:
                this.f16051b.lambda$processUpdateArray$391(this.f16052c);
                return;
            default:
                this.f16051b.lambda$processUpdateArray$390(this.f16052c);
                return;
        }
    }
}
