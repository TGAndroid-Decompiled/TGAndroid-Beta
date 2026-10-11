package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17996a;
    public final MessagesStorage f17997b;
    public final TLRPC.TL_chatFull f17998c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17996a = i10;
        this.f17997b = messagesStorage;
        this.f17998c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17996a) {
            case 0:
                this.f17997b.lambda$updateChatParticipants$121(this.f17998c);
                return;
            default:
                this.f17997b.lambda$updateChatInfo$139(this.f17998c);
                return;
        }
    }
}
