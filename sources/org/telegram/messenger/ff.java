package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ff implements Runnable {
    public final int f18378a;
    public final MessagesStorage f18379b;
    public final TLRPC.TL_chatFull f18380c;

    public ff(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f18378a = i10;
        this.f18379b = messagesStorage;
        this.f18380c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f18378a) {
            case 0:
                this.f18379b.lambda$updateChatParticipants$121(this.f18380c);
                return;
            default:
                this.f18379b.lambda$updateChatInfo$139(this.f18380c);
                return;
        }
    }
}
