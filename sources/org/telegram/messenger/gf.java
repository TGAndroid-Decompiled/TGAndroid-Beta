package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class gf implements Runnable {

    public final int f20389a;

    public final MessagesStorage f20390b;

    public final TLRPC.TL_chatFull f20391c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f20389a = i10;
        this.f20390b = messagesStorage;
        this.f20391c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f20389a) {
            case 0:
                this.f20390b.lambda$updateChatParticipants$121(this.f20391c);
                break;
            default:
                this.f20390b.lambda$updateChatInfo$139(this.f20391c);
                break;
        }
    }
}
