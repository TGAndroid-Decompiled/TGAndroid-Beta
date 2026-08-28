package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cf implements Runnable {
    public final int f19997a;
    public final MessagesStorage f19998b;
    public final TLRPC.TL_chatFull f19999c;

    public cf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i9) {
        this.f19997a = i9;
        this.f19998b = messagesStorage;
        this.f19999c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f19997a) {
            case 0:
                this.f19998b.lambda$updateChatParticipants$121(this.f19999c);
                return;
            default:
                this.f19998b.lambda$updateChatInfo$139(this.f19999c);
                return;
        }
    }
}
