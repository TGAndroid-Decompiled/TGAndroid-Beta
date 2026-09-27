package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f16472a;
    public final MessagesStorage f16473b;
    public final TLRPC.TL_chatFull f16474c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16472a = i10;
        this.f16473b = messagesStorage;
        this.f16474c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16472a) {
            case 0:
                this.f16473b.lambda$updateChatParticipants$121(this.f16474c);
                return;
            default:
                this.f16473b.lambda$updateChatInfo$139(this.f16474c);
                return;
        }
    }
}
