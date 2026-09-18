package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f16514a;
    public final MessagesStorage f16515b;
    public final TLRPC.TL_chatFull f16516c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16514a = i10;
        this.f16515b = messagesStorage;
        this.f16516c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16514a) {
            case 0:
                this.f16515b.lambda$updateChatParticipants$121(this.f16516c);
                return;
            default:
                this.f16515b.lambda$updateChatInfo$139(this.f16516c);
                return;
        }
    }
}
