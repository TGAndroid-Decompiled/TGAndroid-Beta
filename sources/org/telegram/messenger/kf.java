package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kf implements Runnable {
    public final int f18848a;
    public final MessagesStorage f18849b;
    public final TLRPC.TL_chatFull f18850c;

    public kf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18848a = i10;
        this.f18849b = messagesStorage;
        this.f18850c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18848a) {
            case 0:
                this.f18849b.lambda$updateChatParticipants$121(this.f18850c);
                return;
            default:
                this.f18849b.lambda$updateChatInfo$139(this.f18850c);
                return;
        }
    }
}
