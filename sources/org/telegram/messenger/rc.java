package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class rc implements Runnable {
    public final int f19087a;
    public final MessagesController f19088b;
    public final TL_update.TL_updatePeerBlocked f19089c;

    public rc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19087a = i10;
        this.f19088b = messagesController;
        this.f19089c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19087a) {
            case 0:
                this.f19088b.lambda$processUpdateArray$394(this.f19089c);
                return;
            default:
                this.f19088b.lambda$processUpdateArray$393(this.f19089c);
                return;
        }
    }
}
