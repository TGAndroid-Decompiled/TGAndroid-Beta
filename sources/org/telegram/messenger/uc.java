package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class uc implements Runnable {
    public final int f19101a;
    public final MessagesController f19102b;
    public final TL_update.TL_updatePeerBlocked f19103c;

    public uc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19101a = i10;
        this.f19102b = messagesController;
        this.f19103c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19101a) {
            case 0:
                this.f19102b.lambda$processUpdateArray$394(this.f19103c);
                return;
            default:
                this.f19102b.lambda$processUpdateArray$393(this.f19103c);
                return;
        }
    }
}
