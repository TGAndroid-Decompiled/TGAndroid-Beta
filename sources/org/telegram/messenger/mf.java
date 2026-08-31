package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f19367a;
    public final MessagesStorage f19368b;
    public final TLRPC.TL_chatFull f19369c;

    public mf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f19367a = i10;
        this.f19368b = messagesStorage;
        this.f19369c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f19367a) {
            case 0:
                this.f19368b.lambda$updateChatParticipants$121(this.f19369c);
                return;
            default:
                this.f19368b.lambda$updateChatInfo$139(this.f19369c);
                return;
        }
    }
}
