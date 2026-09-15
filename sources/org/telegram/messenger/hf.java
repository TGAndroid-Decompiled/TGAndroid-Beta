package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f16335a;
    public final MessagesStorage f16336b;
    public final TLRPC.TL_chatFull f16337c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16335a = i10;
        this.f16336b = messagesStorage;
        this.f16337c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16335a) {
            case 0:
                this.f16336b.lambda$updateChatParticipants$121(this.f16337c);
                return;
            default:
                this.f16336b.lambda$updateChatInfo$139(this.f16337c);
                return;
        }
    }
}
