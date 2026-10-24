package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class uc implements Runnable {
    public final int f19752a;
    public final MessagesController f19753b;
    public final TL_update.TL_updatePeerBlocked f19754c;

    public uc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19752a = i10;
        this.f19753b = messagesController;
        this.f19754c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19752a) {
            case 0:
                this.f19753b.lambda$processUpdateArray$394(this.f19754c);
                return;
            default:
                this.f19753b.lambda$processUpdateArray$393(this.f19754c);
                return;
        }
    }
}
