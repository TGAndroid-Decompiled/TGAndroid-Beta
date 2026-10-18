package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ef implements Runnable {
    public final int f18301a;
    public final MessagesStorage f18302b;
    public final TLRPC.TL_chatFull f18303c;

    public ef(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18301a = i10;
        this.f18302b = messagesStorage;
        this.f18303c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18301a) {
            case 0:
                this.f18302b.lambda$updateChatParticipants$121(this.f18303c);
                return;
            default:
                this.f18302b.lambda$updateChatInfo$139(this.f18303c);
                return;
        }
    }
}
