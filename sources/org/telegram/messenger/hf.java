package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hf implements Runnable {
    public final int f16329a;
    public final MessagesStorage f16330b;
    public final TLRPC.TL_chatFull f16331c;

    public hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f16329a = i10;
        this.f16330b = messagesStorage;
        this.f16331c = tL_chatFull;
    }

    @Override
    public final void run() {
        switch (this.f16329a) {
            case 0:
                this.f16330b.lambda$updateChatParticipants$121(this.f16331c);
                return;
            default:
                this.f16330b.lambda$updateChatInfo$139(this.f16331c);
                return;
        }
    }
}
