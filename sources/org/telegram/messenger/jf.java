package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jf implements Runnable {
    public final int f18706a;
    public final MessagesStorage f18707b;
    public final TLRPC.TL_chatFull f18708c;

    public jf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18706a = i10;
        this.f18707b = messagesStorage;
        this.f18708c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18706a) {
            case 0:
                this.f18707b.lambda$updateChatParticipants$121(this.f18708c);
                return;
            default:
                this.f18707b.lambda$updateChatInfo$139(this.f18708c);
                return;
        }
    }
}
