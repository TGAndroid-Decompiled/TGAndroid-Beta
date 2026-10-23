package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jf implements Runnable {
    public final int f18772a;
    public final MessagesStorage f18773b;
    public final TLRPC.TL_chatFull f18774c;

    public jf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18772a = i10;
        this.f18773b = messagesStorage;
        this.f18774c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18772a) {
            case 0:
                this.f18773b.lambda$updateChatParticipants$121(this.f18774c);
                return;
            default:
                this.f18773b.lambda$updateChatInfo$139(this.f18774c);
                return;
        }
    }
}
