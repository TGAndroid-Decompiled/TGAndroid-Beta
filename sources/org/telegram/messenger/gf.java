package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17957a;
    public final MessagesStorage f17958b;
    public final TLRPC.TL_chatFull f17959c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17957a = i10;
        this.f17958b = messagesStorage;
        this.f17959c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17957a) {
            case 0:
                this.f17958b.lambda$updateChatParticipants$121(this.f17959c);
                return;
            default:
                this.f17958b.lambda$updateChatInfo$139(this.f17959c);
                return;
        }
    }
}
