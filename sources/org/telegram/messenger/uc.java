package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class uc implements Runnable {
    public final int f18287a;
    public final MessagesController f18288b;
    public final TL_update.TL_updatePeerBlocked f18289c;

    public uc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f18287a = i10;
        this.f18288b = messagesController;
        this.f18289c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f18287a) {
            case 0:
                this.f18288b.lambda$processUpdateArray$394(this.f18289c);
                return;
            default:
                this.f18288b.lambda$processUpdateArray$393(this.f18289c);
                return;
        }
    }
}
