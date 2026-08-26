package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda408 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TLRPC.TL_help_peerColors f$1;

    public MessagesController$$ExternalSyntheticLambda408(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkPeerColors$492(this.f$1);
                break;
            default:
                this.f$0.lambda$checkPeerColors$490(this.f$1);
                break;
        }
    }
}
