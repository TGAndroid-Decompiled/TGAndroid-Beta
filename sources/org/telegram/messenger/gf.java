package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f16476a;
    public final MessagesStorage f16477b;
    public final TLRPC.TL_chatFull f16478c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16476a = i10;
        this.f16477b = messagesStorage;
        this.f16478c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16476a) {
            case 0:
                this.f16477b.lambda$updateChatParticipants$121(this.f16478c);
                return;
            default:
                this.f16477b.lambda$updateChatInfo$139(this.f16478c);
                return;
        }
    }
}
