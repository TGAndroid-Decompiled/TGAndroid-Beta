package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qc implements Runnable {
    public final int f19353a;
    public final MessagesController f19354b;
    public final TL_update.TL_updatePeerBlocked f19355c;

    public qc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.f19353a = i10;
        this.f19354b = messagesController;
        this.f19355c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f19353a) {
            case 0:
                this.f19354b.lambda$processUpdateArray$394(this.f19355c);
                return;
            default:
                this.f19354b.lambda$processUpdateArray$393(this.f19355c);
                return;
        }
    }
}
