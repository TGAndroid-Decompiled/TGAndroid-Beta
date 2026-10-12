package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kf implements Runnable {
    public final int f18077a;
    public final MessagesStorage f18078b;
    public final TLRPC.TL_chatFull f18079c;

    public kf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18077a = i10;
        this.f18078b = messagesStorage;
        this.f18079c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18077a) {
            case 0:
                this.f18078b.lambda$updateChatParticipants$121(this.f18079c);
                return;
            default:
                this.f18078b.lambda$updateChatInfo$139(this.f18079c);
                return;
        }
    }
}
