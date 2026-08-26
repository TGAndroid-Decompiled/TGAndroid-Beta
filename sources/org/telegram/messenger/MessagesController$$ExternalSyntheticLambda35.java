package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class MessagesController$$ExternalSyntheticLambda35 implements Runnable {
    public final int $r8$classId = 1;
    public final MessagesController f$0;
    public final TLObject f$1;
    public final long f$2;

    public MessagesController$$ExternalSyntheticLambda35(MessagesController messagesController, long j, TLObject tLObject) {
        this.f$0 = messagesController;
        this.f$2 = j;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteUserPhoto$114(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$loadPeerSettings$79(this.f$2, this.f$1);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda35(MessagesController messagesController, TLObject tLObject, long j) {
        this.f$0 = messagesController;
        this.f$1 = tLObject;
        this.f$2 = j;
    }
}
