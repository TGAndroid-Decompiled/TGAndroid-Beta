package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f18471a;
    public final MessagesStorage f18472b;
    public final TLRPC.TL_chatFull f18473c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18471a = i10;
        this.f18472b = messagesStorage;
        this.f18473c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18471a) {
            case 0:
                this.f18472b.lambda$updateChatParticipants$121(this.f18473c);
                return;
            default:
                this.f18472b.lambda$updateChatInfo$139(this.f18473c);
                return;
        }
    }
}
