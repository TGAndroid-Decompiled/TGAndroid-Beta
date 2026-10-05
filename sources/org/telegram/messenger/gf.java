package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17973a;
    public final MessagesStorage f17974b;
    public final TLRPC.TL_chatFull f17975c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17973a = i10;
        this.f17974b = messagesStorage;
        this.f17975c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17973a) {
            case 0:
                this.f17974b.lambda$updateChatParticipants$121(this.f17975c);
                return;
            default:
                this.f17974b.lambda$updateChatInfo$139(this.f17975c);
                return;
        }
    }
}
