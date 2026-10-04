package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17972a;
    public final MessagesStorage f17973b;
    public final TLRPC.TL_chatFull f17974c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17972a = i10;
        this.f17973b = messagesStorage;
        this.f17974c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17972a) {
            case 0:
                this.f17973b.lambda$updateChatParticipants$121(this.f17974c);
                return;
            default:
                this.f17973b.lambda$updateChatInfo$139(this.f17974c);
                return;
        }
    }
}
