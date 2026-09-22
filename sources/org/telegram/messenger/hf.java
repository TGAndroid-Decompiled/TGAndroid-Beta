package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f16575a;
    public final MessagesStorage f16576b;
    public final TLRPC.TL_chatFull f16577c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16575a = i10;
        this.f16576b = messagesStorage;
        this.f16577c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16575a) {
            case 0:
                this.f16576b.lambda$updateChatParticipants$121(this.f16577c);
                return;
            default:
                this.f16576b.lambda$updateChatInfo$139(this.f16577c);
                return;
        }
    }
}
