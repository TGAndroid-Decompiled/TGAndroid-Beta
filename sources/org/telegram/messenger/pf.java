package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f20963a;
    public final MessagesStorage f20964b;
    public final TLRPC.TL_chatFull f20965c;

    public pf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f20963a = i10;
        this.f20964b = messagesStorage;
        this.f20965c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f20963a) {
            case 0:
                this.f20964b.lambda$updateChatInfo$143(this.f20965c);
                return;
            default:
                this.f20964b.lambda$updateChatParticipants$125(this.f20965c);
                return;
        }
    }
}
