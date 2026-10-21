package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class rc implements Runnable {
    public final int f19445a;
    public final MessagesController f19446b;
    public final TL_update.TL_updatePeerBlocked f19447c;

    public rc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19445a = i10;
        this.f19446b = messagesController;
        this.f19447c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19445a) {
            case 0:
                this.f19446b.lambda$processUpdateArray$394(this.f19447c);
                return;
            default:
                this.f19446b.lambda$processUpdateArray$393(this.f19447c);
                return;
        }
    }
}
