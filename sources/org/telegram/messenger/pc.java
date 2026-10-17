package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class pc implements Runnable {
    public final int f19273a;
    public final MessagesController f19274b;
    public final TL_update.TL_updatePeerBlocked f19275c;

    public pc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19273a = i10;
        this.f19274b = messagesController;
        this.f19275c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                this.f19274b.lambda$processUpdateArray$394(this.f19275c);
                return;
            default:
                this.f19274b.lambda$processUpdateArray$393(this.f19275c);
                return;
        }
    }
}
