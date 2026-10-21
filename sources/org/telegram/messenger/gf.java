package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f18464a;
    public final MessagesStorage f18465b;
    public final TLRPC.TL_chatFull f18466c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18464a = i10;
        this.f18465b = messagesStorage;
        this.f18466c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18464a) {
            case 0:
                this.f18465b.lambda$updateChatParticipants$121(this.f18466c);
                return;
            default:
                this.f18465b.lambda$updateChatInfo$139(this.f18466c);
                return;
        }
    }
}
