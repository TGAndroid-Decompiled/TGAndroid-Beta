package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kf implements Runnable {
    public final int f17694a;
    public final MessagesStorage f17695b;
    public final TLRPC.TL_chatFull f17696c;

    public kf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f17694a = i10;
        this.f17695b = messagesStorage;
        this.f17696c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f17694a) {
            case 0:
                this.f17695b.lambda$updateChatParticipants$121(this.f17696c);
                return;
            default:
                this.f17695b.lambda$updateChatInfo$139(this.f17696c);
                return;
        }
    }
}
