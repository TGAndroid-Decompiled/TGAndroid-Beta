package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ff implements Runnable {
    public final int f18381a;
    public final MessagesStorage f18382b;
    public final TLRPC.TL_chatFull f18383c;

    public ff(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18381a = i10;
        this.f18382b = messagesStorage;
        this.f18383c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18381a) {
            case 0:
                this.f18382b.lambda$updateChatParticipants$121(this.f18383c);
                return;
            default:
                this.f18382b.lambda$updateChatInfo$139(this.f18383c);
                return;
        }
    }
}
