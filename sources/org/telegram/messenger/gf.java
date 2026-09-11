package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17804a;
    public final MessagesStorage f17805b;
    public final TLRPC.TL_chatFull f17806c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17804a = i10;
        this.f17805b = messagesStorage;
        this.f17806c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17804a) {
            case 0:
                this.f17805b.lambda$updateChatParticipants$121(this.f17806c);
                return;
            default:
                this.f17805b.lambda$updateChatInfo$139(this.f17806c);
                return;
        }
    }
}
