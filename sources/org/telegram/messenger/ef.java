package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ef implements Runnable {
    public final int f18287a;
    public final MessagesStorage f18288b;
    public final TLRPC.TL_chatFull f18289c;

    public ef(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18287a = i10;
        this.f18288b = messagesStorage;
        this.f18289c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18287a) {
            case 0:
                this.f18288b.lambda$updateChatParticipants$121(this.f18289c);
                return;
            default:
                this.f18288b.lambda$updateChatInfo$139(this.f18289c);
                return;
        }
    }
}
