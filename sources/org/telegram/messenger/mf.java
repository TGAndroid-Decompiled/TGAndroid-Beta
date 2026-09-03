package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f17826a;
    public final MessagesStorage f17827b;
    public final TLRPC.TL_chatFull f17828c;

    public mf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17826a = i10;
        this.f17827b = messagesStorage;
        this.f17828c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17826a) {
            case 0:
                this.f17827b.lambda$updateChatParticipants$121(this.f17828c);
                return;
            default:
                this.f17827b.lambda$updateChatInfo$139(this.f17828c);
                return;
        }
    }
}
