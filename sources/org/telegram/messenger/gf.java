package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f16217a;
    public final MessagesStorage f16218b;
    public final TLRPC.TL_chatFull f16219c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16217a = i10;
        this.f16218b = messagesStorage;
        this.f16219c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16217a) {
            case 0:
                this.f16218b.lambda$updateChatParticipants$121(this.f16219c);
                return;
            default:
                this.f16218b.lambda$updateChatInfo$139(this.f16219c);
                return;
        }
    }
}
