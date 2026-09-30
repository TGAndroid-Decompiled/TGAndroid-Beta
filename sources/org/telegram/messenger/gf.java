package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f16500a;
    public final MessagesStorage f16501b;
    public final TLRPC.TL_chatFull f16502c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16500a = i10;
        this.f16501b = messagesStorage;
        this.f16502c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16500a) {
            case 0:
                this.f16501b.lambda$updateChatParticipants$121(this.f16502c);
                return;
            default:
                this.f16501b.lambda$updateChatInfo$139(this.f16502c);
                return;
        }
    }
}
