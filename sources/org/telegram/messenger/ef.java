package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ef implements Runnable {
    public final int f18298a;
    public final MessagesStorage f18299b;
    public final TLRPC.TL_chatFull f18300c;

    public ef(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18298a = i10;
        this.f18299b = messagesStorage;
        this.f18300c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18298a) {
            case 0:
                this.f18299b.lambda$updateChatParticipants$121(this.f18300c);
                return;
            default:
                this.f18299b.lambda$updateChatInfo$139(this.f18300c);
                return;
        }
    }
}
