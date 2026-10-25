package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xf implements Runnable {
    public final int f21843a;
    public final MessagesStorage f21844b;
    public final TLRPC.TL_chatFull f21845c;

    public xf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f21843a = i10;
        this.f21844b = messagesStorage;
        this.f21845c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f21843a) {
            case 0:
                this.f21844b.lambda$updateChatInfo$142(this.f21845c);
                return;
            default:
                this.f21844b.lambda$updateChatParticipants$124(this.f21845c);
                return;
        }
    }
}
