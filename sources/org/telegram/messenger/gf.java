package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17831a;
    public final MessagesStorage f17832b;
    public final TLRPC.TL_chatFull f17833c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17831a = i10;
        this.f17832b = messagesStorage;
        this.f17833c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17831a) {
            case 0:
                this.f17832b.lambda$updateChatParticipants$121(this.f17833c);
                return;
            default:
                this.f17832b.lambda$updateChatInfo$139(this.f17833c);
                return;
        }
    }
}
