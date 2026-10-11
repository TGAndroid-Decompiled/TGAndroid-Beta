package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17960a;
    public final MessagesStorage f17961b;
    public final TLRPC.TL_chatFull f17962c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17960a = i10;
        this.f17961b = messagesStorage;
        this.f17962c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17960a) {
            case 0:
                this.f17961b.lambda$updateChatParticipants$121(this.f17962c);
                return;
            default:
                this.f17961b.lambda$updateChatInfo$139(this.f17962c);
                return;
        }
    }
}
