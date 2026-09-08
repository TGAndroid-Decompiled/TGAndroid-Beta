package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f17915a;
    public final MessagesStorage f17916b;
    public final TLRPC.TL_chatFull f17917c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17915a = i10;
        this.f17916b = messagesStorage;
        this.f17917c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                this.f17916b.lambda$updateChatParticipants$121(this.f17917c);
                return;
            default:
                this.f17916b.lambda$updateChatInfo$139(this.f17917c);
                return;
        }
    }
}
