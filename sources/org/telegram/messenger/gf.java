package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f16484a;
    public final MessagesStorage f16485b;
    public final TLRPC.TL_chatFull f16486c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16484a = i10;
        this.f16485b = messagesStorage;
        this.f16486c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16484a) {
            case 0:
                this.f16485b.lambda$updateChatParticipants$121(this.f16486c);
                return;
            default:
                this.f16485b.lambda$updateChatInfo$139(this.f16486c);
                return;
        }
    }
}
