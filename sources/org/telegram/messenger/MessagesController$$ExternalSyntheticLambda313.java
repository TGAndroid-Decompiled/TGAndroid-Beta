package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

public final class MessagesController$$ExternalSyntheticLambda313 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TL_update.TL_updatePeerBlocked f$1;

    public MessagesController$$ExternalSyntheticLambda313(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processUpdateArray$391(this.f$1);
                break;
            default:
                this.f$0.lambda$processUpdateArray$390(this.f$1);
                break;
        }
    }
}
