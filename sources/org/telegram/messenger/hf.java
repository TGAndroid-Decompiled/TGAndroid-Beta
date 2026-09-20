package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f16560a;
    public final MessagesStorage f16561b;
    public final TLRPC.TL_chatFull f16562c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16560a = i10;
        this.f16561b = messagesStorage;
        this.f16562c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16560a) {
            case 0:
                this.f16561b.lambda$updateChatParticipants$121(this.f16562c);
                return;
            default:
                this.f16561b.lambda$updateChatInfo$139(this.f16562c);
                return;
        }
    }
}
