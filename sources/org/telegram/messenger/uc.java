package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class uc implements Runnable {
    public final int f19100a;
    public final MessagesController f19101b;
    public final TL_update.TL_updatePeerBlocked f19102c;

    public uc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19100a = i10;
        this.f19101b = messagesController;
        this.f19102c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19100a) {
            case 0:
                this.f19101b.lambda$processUpdateArray$394(this.f19102c);
                return;
            default:
                this.f19101b.lambda$processUpdateArray$393(this.f19102c);
                return;
        }
    }
}
