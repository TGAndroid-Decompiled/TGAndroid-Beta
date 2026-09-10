package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f16142a;
    public final MessagesStorage f16143b;
    public final TLRPC.TL_chatFull f16144c;

    public qf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16142a = i10;
        this.f16143b = messagesStorage;
        this.f16144c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16142a) {
            case 0:
                this.f16143b.lambda$updateChatParticipants$121(this.f16144c);
                return;
            default:
                this.f16143b.lambda$updateChatInfo$139(this.f16144c);
                return;
        }
    }
}
