package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f19369a;
    public final MessagesStorage f19370b;
    public final TLRPC.TL_chatFull f19371c;

    public mf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f19369a = i10;
        this.f19370b = messagesStorage;
        this.f19371c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f19369a) {
            case 0:
                this.f19370b.lambda$updateChatParticipants$121(this.f19371c);
                return;
            default:
                this.f19370b.lambda$updateChatInfo$139(this.f19371c);
                return;
        }
    }
}
