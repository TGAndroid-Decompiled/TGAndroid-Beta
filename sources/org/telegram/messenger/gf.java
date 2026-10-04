package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f17968a;
    public final MessagesStorage f17969b;
    public final TLRPC.TL_chatFull f17970c;

    public gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17968a = i10;
        this.f17969b = messagesStorage;
        this.f17970c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17968a) {
            case 0:
                this.f17969b.lambda$updateChatParticipants$121(this.f17970c);
                return;
            default:
                this.f17969b.lambda$updateChatInfo$139(this.f17970c);
                return;
        }
    }
}
