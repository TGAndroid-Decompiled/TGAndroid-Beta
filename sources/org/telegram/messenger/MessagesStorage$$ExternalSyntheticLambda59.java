package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesStorage$$ExternalSyntheticLambda59 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final TLRPC.TL_chatFull f$1;

    public MessagesStorage$$ExternalSyntheticLambda59(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateChatInfo$139(this.f$1);
                break;
            default:
                this.f$0.lambda$updateChatParticipants$121(this.f$1);
                break;
        }
    }
}
