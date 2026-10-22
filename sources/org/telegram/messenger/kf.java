package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kf implements Runnable {
    public final int f18782a;
    public final MessagesStorage f18783b;
    public final TLRPC.TL_chatFull f18784c;

    public kf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18782a = i10;
        this.f18783b = messagesStorage;
        this.f18784c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18782a) {
            case 0:
                this.f18783b.lambda$updateChatParticipants$121(this.f18784c);
                return;
            default:
                this.f18783b.lambda$updateChatInfo$139(this.f18784c);
                return;
        }
    }
}
