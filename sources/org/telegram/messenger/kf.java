package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kf implements Runnable {
    public final int f18076a;
    public final MessagesStorage f18077b;
    public final TLRPC.TL_chatFull f18078c;

    public kf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18076a = i10;
        this.f18077b = messagesStorage;
        this.f18078c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18076a) {
            case 0:
                this.f18077b.lambda$updateChatParticipants$121(this.f18078c);
                return;
            default:
                this.f18077b.lambda$updateChatInfo$139(this.f18078c);
                return;
        }
    }
}
