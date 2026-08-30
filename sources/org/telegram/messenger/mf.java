package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f17846a;
    public final MessagesStorage f17847b;
    public final TLRPC.TL_chatFull f17848c;

    public mf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17846a = i10;
        this.f17847b = messagesStorage;
        this.f17848c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17846a) {
            case 0:
                this.f17847b.lambda$updateChatParticipants$121(this.f17848c);
                return;
            default:
                this.f17847b.lambda$updateChatInfo$139(this.f17848c);
                return;
        }
    }
}
