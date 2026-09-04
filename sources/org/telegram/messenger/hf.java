package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f17888a;
    public final MessagesStorage f17889b;
    public final TLRPC.TL_chatFull f17890c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17888a = i10;
        this.f17889b = messagesStorage;
        this.f17890c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17888a) {
            case 0:
                this.f17889b.lambda$updateChatParticipants$121(this.f17890c);
                return;
            default:
                this.f17889b.lambda$updateChatInfo$139(this.f17890c);
                return;
        }
    }
}
