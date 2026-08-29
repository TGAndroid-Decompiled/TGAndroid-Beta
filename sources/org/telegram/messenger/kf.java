package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kf implements Runnable {
    public final int f20765a;
    public final MessagesStorage f20766b;
    public final TLRPC.TL_chatFull f20767c;

    public kf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f20765a = i10;
        this.f20766b = messagesStorage;
        this.f20767c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f20765a) {
            case 0:
                this.f20766b.lambda$updateChatParticipants$121(this.f20767c);
                return;
            default:
                this.f20766b.lambda$updateChatInfo$139(this.f20767c);
                return;
        }
    }
}
