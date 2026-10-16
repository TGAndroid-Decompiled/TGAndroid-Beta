package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kf implements Runnable {
    public final int f17393a;
    public final MessagesStorage f17394b;
    public final TLRPC.TL_chatFull f17395c;

    public kf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17393a = i10;
        this.f17394b = messagesStorage;
        this.f17395c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17393a) {
            case 0:
                this.f17394b.lambda$updateChatParticipants$121(this.f17395c);
                return;
            default:
                this.f17394b.lambda$updateChatInfo$139(this.f17395c);
                return;
        }
    }
}
