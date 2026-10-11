package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class rc implements Runnable {
    public final int f19051a;
    public final MessagesController f19052b;
    public final TL_update.TL_updatePeerBlocked f19053c;

    public rc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19051a = i10;
        this.f19052b = messagesController;
        this.f19053c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19051a) {
            case 0:
                this.f19052b.lambda$processUpdateArray$394(this.f19053c);
                return;
            default:
                this.f19052b.lambda$processUpdateArray$393(this.f19053c);
                return;
        }
    }
}
