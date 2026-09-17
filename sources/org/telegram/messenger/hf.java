package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f16344a;
    public final MessagesStorage f16345b;
    public final TLRPC.TL_chatFull f16346c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16344a = i10;
        this.f16345b = messagesStorage;
        this.f16346c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16344a) {
            case 0:
                this.f16345b.lambda$updateChatParticipants$121(this.f16346c);
                return;
            default:
                this.f16345b.lambda$updateChatInfo$139(this.f16346c);
                return;
        }
    }
}
