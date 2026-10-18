package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class pc implements Runnable {
    public final int f19275a;
    public final MessagesController f19276b;
    public final TL_update.TL_updatePeerBlocked f19277c;

    public pc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19275a = i10;
        this.f19276b = messagesController;
        this.f19277c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19275a) {
            case 0:
                this.f19276b.lambda$processUpdateArray$394(this.f19277c);
                return;
            default:
                this.f19276b.lambda$processUpdateArray$393(this.f19277c);
                return;
        }
    }
}
