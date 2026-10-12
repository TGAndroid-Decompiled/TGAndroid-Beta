package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class uc implements Runnable {
    public final int f18586a;
    public final MessagesController f18587b;
    public final TL_update.TL_updatePeerBlocked f18588c;

    public uc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f18586a = i10;
        this.f18587b = messagesController;
        this.f18588c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f18586a) {
            case 0:
                this.f18587b.lambda$processUpdateArray$394(this.f18588c);
                return;
            default:
                this.f18587b.lambda$processUpdateArray$393(this.f18588c);
                return;
        }
    }
}
