package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f16483a;
    public final MessagesStorage f16484b;
    public final TLRPC.TL_chatFull f16485c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16483a = i10;
        this.f16484b = messagesStorage;
        this.f16485c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16483a) {
            case 0:
                this.f16484b.lambda$updateChatParticipants$121(this.f16485c);
                return;
            default:
                this.f16484b.lambda$updateChatInfo$139(this.f16485c);
                return;
        }
    }
}
