package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17961a;
    public final MessagesStorage f17962b;
    public final TLRPC.TL_chatFull f17963c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17961a = i10;
        this.f17962b = messagesStorage;
        this.f17963c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$updateChatParticipants$121(this.f17963c);
                return;
            default:
                this.f17962b.lambda$updateChatInfo$139(this.f17963c);
                return;
        }
    }
}
