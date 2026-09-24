package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f16461a;
    public final MessagesStorage f16462b;
    public final TLRPC.TL_chatFull f16463c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16461a = i10;
        this.f16462b = messagesStorage;
        this.f16463c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16461a) {
            case 0:
                this.f16462b.lambda$updateChatParticipants$121(this.f16463c);
                return;
            default:
                this.f16462b.lambda$updateChatInfo$139(this.f16463c);
                return;
        }
    }
}
